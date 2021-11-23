@it.innove.ReactMethod
public void checkState() {
    android.util.Log.d(it.innove.BleManager.LOG_TAG, "checkState");
    android.bluetooth.BluetoothAdapter adapter = getBluetoothAdapter();
    java.lang.String state = "off";
    if (adapter != null) {
        switch (adapter.getState()) {
            case android.bluetooth.BluetoothAdapter.STATE_ON :
                state = "on";
                break;
            case android.bluetooth.BluetoothAdapter.STATE_OFF :
                state = "off";
        }
    }
    it.innove.WritableMap map = it.innove.Arguments.createMap();
    map.putString("state", state);
    android.util.Log.d(it.innove.BleManager.LOG_TAG, ("state:" + state));
    sendEvent("BleManagerDidUpdateState", map);
}