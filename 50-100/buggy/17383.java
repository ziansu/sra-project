@java.lang.Override
protected void connectOk() {
    java.io.InputStream stream;
    try {
        stream = socket.getInputStream();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ;
    }
    deviceReadThread = new org.embox.robobot.BtDevice.DeviceReadThread(this, stream);
    deviceReadThread.start();
    if ((deviceState) == (DEVICE_DETERMING)) {
        determBotSendStamp();
    }else {
        outsideHandler.connectOk();
    }
}