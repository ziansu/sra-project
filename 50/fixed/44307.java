@android.annotation.RequiresPermission(value = Manifest.permission.BLUETOOTH)
public java.lang.String getAddress() {
    try {
        return com.oinux.android.ConfigLoader.getInstance().get(Config.BLUETOOTH_ADDRESS, mManagerService.getAddress());
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.bluetooth.BluetoothAdapter.TAG, "", e);
    }
    return null;
}