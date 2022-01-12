private int openInputStream() {
    try {
        java.io.InputStream tmpIn = socket.getInputStream();
        inputStream = tmpIn;
        return com.weisser.bluetoothtester.BluetoothThread.SUCCESS;
    } catch (java.io.IOException e) {
        android.util.Log.e(com.weisser.bluetoothtester.BluetoothThread.LOGTAG, ("IOException socket.getInputStream() " + (getThreadId())), e);
        return com.weisser.bluetoothtester.BluetoothThread.ERR_SOCKET_INPUT_STREAM;
    }
}