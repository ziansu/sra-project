private static void fixBluetoothName() {
    android.bluetooth.BluetoothAdapter adapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (adapter != null) {
        java.lang.String oldName = adapter.getName();
        if (oldName.equals("Braille to Go")) {
            java.lang.String newName = "B2G";
            adapter.setName(newName);
            android.util.Log.w(org.nbp.b2g.ui.ApplicationContext.LOG_TAG, java.lang.String.format("Bluetooth name changed: %s -> %s", oldName, newName));
        }
    }
}