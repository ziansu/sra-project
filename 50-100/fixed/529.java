private void addPairedDevice() {
    if ((btAdapter) == null)
        return ;
    
    java.util.Set<android.bluetooth.BluetoothDevice> pairedDevices = btAdapter.getBondedDevices();
    if ((pairedDevices.size()) > 0) {
        for (android.bluetooth.BluetoothDevice device : pairedDevices) {
            java.lang.String str = ((device.getAddress()) + "|") + (device.getName());
            lstDevices.add(str);
            adtDevices.notifyDataSetChanged();
        }
    }
}