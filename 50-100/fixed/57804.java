private boolean createBondApi18(final android.bluetooth.BluetoothDevice device) {
    try {
        final java.lang.reflect.Method createBond = device.getClass().getMethod("createBond");
        if (createBond != null) {
            mService.sendLogBroadcast(DfuBaseService.LOG_LEVEL_DEBUG, "gatt.getDevice().createBond() (hidden)");
            return ((java.lang.Boolean) (createBond.invoke(device)));
        }
    } catch (final java.lang.Exception e) {
        android.util.Log.w(no.nordicsemi.android.dfu.BaseDfuImpl.TAG, "An exception occurred while creating bond", e);
    }
    return false;
}