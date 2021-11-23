@android.support.annotation.Nullable
public static uu.toolbox.bluetooth.UUBluetoothError gattStatusError(@android.support.annotation.NonNull
final java.lang.String method, final int gattStatus) {
    if (gattStatus != (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        uu.toolbox.bluetooth.UUBluetoothError err = new uu.toolbox.bluetooth.UUBluetoothError(UUBluetoothErrorCode.OperationFailed);
        err.errorDetails.put(uu.toolbox.bluetooth.UUBluetoothError.DETAIL_KEY_METHOD_NAME, method);
        err.errorDetails.put(uu.toolbox.bluetooth.UUBluetoothError.DETAIL_KEY_GATT_STATUS, java.lang.String.valueOf(gattStatus));
        return err;
    }else {
        return null;
    }
}