@java.lang.Override
protected void connectOk() {
    java.io.InputStream stream;
    try {
        stream = socket.getInputStream();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ;
    }
    if ((deviceState) == (DEVICE_DETERMING)) {
        deviceReadThread = new org.embox.robobot.BtDevice.DeviceReadThread(this, stream);
        deviceReadThread.start();
        determBotSendStamp();
    }else {
        outsideHandler.connectOk();
    }
}