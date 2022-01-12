private void sendData() {
    sendQueue.offer(new org.astrobotics.ds2016.io.Protocol.ControlData(controlData));
}