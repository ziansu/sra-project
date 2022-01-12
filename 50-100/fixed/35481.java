void onData(java.lang.String data) {
    mBuffer.append(data);
    while (true) {
        java.lang.String completeData = readUntil(this.delimiter);
        if ((completeData != null) && ((completeData.length()) > 0)) {
            com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
            params.putString("data", completeData);
            sendEvent(com.rusel.RCTBluetoothSerial.RCTBluetoothSerialModule.DEVICE_READ, params);
        }else {
            break;
        }
    } 
}