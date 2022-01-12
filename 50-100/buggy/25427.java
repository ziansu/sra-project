public static java.lang.Boolean isconnect() {
    if ((com.hengxuan.eht.bluetooth.BluetoothServiceProxy.btSocket) != null) {
        if ((Build.VERSION.SDK_INT) >= 14) {
            if (com.hengxuan.eht.bluetooth.BluetoothServiceProxy.btSocket.isConnected()) {
                return true;
            }
        }else {
            return true;
        }
    }
    return false;
}