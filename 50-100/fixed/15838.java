public void reset() {
    bluetoothSockets.clear();
    if ((bluetoothServices) != null) {
        for (nus.cs4347.commductor.bluetooth.BluetoothService service : bluetoothServices) {
            service.destroy();
        }
        bluetoothServices.clear();
    }else {
        for (android.bluetooth.BluetoothSocket socket : bluetoothSockets) {
            try {
                socket.close();
            } catch (java.lang.Exception e) {
            }
        }
    }
}