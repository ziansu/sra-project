public java.lang.String getLocalName() {
    java.lang.String name = null;
    android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (adapter != null) {
        if (!(adapter.isEnabled())) {
            name = "bluetooth disabled";
        }else {
            name = adapter.getName();
        }
    }
    if (name == null) {
        name = "not available";
    }
    return name;
}