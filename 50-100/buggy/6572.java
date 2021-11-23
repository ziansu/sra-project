public void setEnabled(boolean state) {
    this.state = state;
    if (state == false) {
        oscP5.OscMessage myMessage = new oscP5.OscMessage("/control/joystick/state");
        myMessage.add(0);
        myMessage.add(0);
        myMessage.add(0.0F);
        myMessage.add(0.0F);
        myMessage.add(0.0F);
        myMessage.add(0);
        oscP5.send(myMessage, myRemoteLocation);
    }
}