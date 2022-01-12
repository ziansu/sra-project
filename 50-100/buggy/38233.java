private java.lang.String currentRFID() {
    java.lang.String currentRFID = "";
    if ((com.faradice.firmware.Firmware.currentID) == null)
        currentRFID = "unknown";
    
    try {
        currentRFID = com.faradice.firmware.Firmware.currentID.trim();
        int endPos = currentRFID.indexOf(" ");
        if (endPos > 0)
            currentRFID = currentRFID.substring(0, endPos);
        
    } catch (java.lang.Throwable th) {
        com.faradice.firmware.io.Log.error(th);
    }
    currentRFID = "unknown";
    return currentRFID;
}