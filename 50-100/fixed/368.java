private int openInputStream() {
    try {
        this.inputStream = socket.getInputStream();
        return com.weisser.bluetoothtester.BluetoothThread.SUCCESS;
    } catch (java.io.IOException e) {
        android.util.Log.e(com.weisser.bluetoothtester.BluetoothThread.LOGTAG, ("IOException socket.getInputStream() " + (getThreadId())), e);
        this.inputStream = null;
        return com.weisser.bluetoothtester.BluetoothThread.ERR_SOCKET_INPUT_STREAM;
    }
}