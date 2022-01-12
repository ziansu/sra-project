public void Start(android.bluetooth.BluetoothSocket socket) {
    if ((this.socket) != null) {
        Shutdown();
    }
    this.socket = socket;
    rxThread = new com.inker.mblockly.MBotServer.SerialTransmission.BTSerialPortAdapter.RxThread(this.socket);
    txThread = new com.inker.mblockly.MBotServer.SerialTransmission.BTSerialPortAdapter.TxThread(this.socket);
    rxThread.start();
    txThread.start();
}