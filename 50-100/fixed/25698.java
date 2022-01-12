public synchronized void remove(final java.lang.String address) {
    if (this.bluetoothGatt.containsKey(address)) {
        android.util.Log.d(net.sylvek.itracing2.BluetoothLEService.TAG, ("remove() - to device " + address));
        if ((this.bluetoothGatt.get(address)) != null) {
            this.bluetoothGatt.get(address).disconnect();
        }
        this.bluetoothGatt.remove(address);
    }
}