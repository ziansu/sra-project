@android.support.annotation.RequiresPermission(value = Manifest.permission.BLUETOOTH)
public final boolean hasBluetoothLeAdvertising() {
    return (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) && (hasBluetoothLe())) && (android.bluetooth.BluetoothAdapter.getDefaultAdapter().isMultipleAdvertisementSupported());
}