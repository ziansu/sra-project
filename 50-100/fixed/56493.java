private java.lang.String readLastChargingId() {
    java.lang.String rfid = null;
    try {
        java.lang.String line = com.faradice.firmware.io.FaraFiles.getLastLineInFile(com.faradice.firmware.Firmware.RFID_CHARGING_FILE);
        if ((line != null) && ((line.length()) > 2)) {
            rfid = line.trim();
        }
    } catch (java.lang.Exception e) {
        rfid = null;
    }
    return rfid;
}