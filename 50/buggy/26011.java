public void disconnect() {
    if ((gatt) != null) {
        gatt.disconnect();
        gatt = null;
        notifyCharacteristic = null;
    }
}