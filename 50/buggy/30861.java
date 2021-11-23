private java.util.LinkedHashMap<java.lang.String, org.bluetooth.gattparser.FieldHolder> parseCharacteristic(java.lang.String serviceUUID, java.lang.String characteristicUUID) {
    java.lang.String shortUUID = org.openhab.binding.bluetoothsmart.internal.BluetoothSmartUtils.getShortUUID(characteristicUUID);
    byte[] value = readCharacteristic(serviceUUID, characteristicUUID);
    return gattParser.parse(shortUUID, value);
}