package org.labrad.browser.client.message;

class PongMessage implements Message {
  public String msg = "PONG";

  protected PongMessage() {}

  public PongMessage(String msg) {
    this.msg = msg;
  }
}