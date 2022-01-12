private android.bluetooth.BluetoothSocket makeFallbackSocket(android.bluetooth.BluetoothSocket tmp) throws java.lang.Exception {
    com.resmed.refresh.utils.AppFileLog.addTrace("BluetoothSetup$ConnectThread::makeFallbackSocket()");
    java.lang.reflect.Method method = tmp.getRemoteDevice().getClass().getMethod("createInsecureRfcommSocket", java.lang.Integer.TYPE);
    return ((android.bluetooth.BluetoothSocket) (method.invoke(tmp.getRemoteDevice(), 1)));
}