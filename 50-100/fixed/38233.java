private java.lang.String currentRFID() {
    java.lang.String currentRFID = "unknown";
    if ((com.faradice.firmware.Firmware.currentID) == null) {
        return currentRFID;
    }
    try {
        currentRFID = com.faradice.firmware.Firmware.currentID.trim();
        int endPos = currentRFID.indexOf(" ");
        if (endPos > 0)
            currentRFID = currentRFID.substring(0, endPos);
        
    } catch (java.lang.Throwable th) {
        com.faradice.firmware.io.Log.error(th);
    }
    return currentRFID;
}