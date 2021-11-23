@android.support.annotation.RequiresPermission(value = Manifest.permission.BLUETOOTH)
public final boolean hasBluetoothLeAdvertising() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        return (hasBluetoothLe()) && (android.bluetooth.BluetoothAdapter.getDefaultAdapter().isMultipleAdvertisementSupported());
    }
    return false;
}