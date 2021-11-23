private static synchronized void sleep() {
    int select = (com.afunx.ble.blelitelib.operation.BleWriteCharacterisitcNoResponsePacketOperation2.mAutoId.getAndAdd(1)) % (com.afunx.ble.blelitelib.operation.BleWriteCharacterisitcNoResponsePacketOperation2.PACKET_INTERVALS.length);
    int sleepTime = (com.afunx.ble.blelitelib.operation.BleWriteCharacterisitcNoResponsePacketOperation2.PACKET_INTERVALS[select]) - ((int) ((java.lang.System.currentTimeMillis()) - (com.afunx.ble.blelitelib.operation.BleWriteCharacterisitcNoResponsePacketOperation2.lastTimestamp)));
    if (sleepTime > 0) {
        try {
            java.lang.Thread.sleep(sleepTime);
        } catch (java.lang.InterruptedException ignore) {
        }
    }
}