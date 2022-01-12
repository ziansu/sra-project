public java.lang.String getLocalName() {
    java.lang.String name = "not available";
    android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (adapter != null) {
        if (!(adapter.isEnabled())) {
            name = "bluetooth disabled";
        }else {
            name = adapter.getName();
        }
    }
    return name;
}