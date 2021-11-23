private android.bluetooth.BluetoothSocket makeFallbackSocket(android.bluetooth.BluetoothSocket tmp) throws java.lang.Exception {
    com.resmed.refresh.utils.AppFileLog.addTrace("BluetoothSetup$ConnectThread::makeFallbackSocket()");
    java.lang.reflect.Method method = tmp.getRemoteDevice().getClass().getMethod("createInsecureRfcommSocket", new java.lang.Class[]{ java.lang.Integer.TYPE });
    return ((android.bluetooth.BluetoothSocket) (method.invoke(tmp.getRemoteDevice(), new java.lang.Object[]{ java.lang.Integer.valueOf(1) })));
}