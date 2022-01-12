@java.lang.Override
public void run() {
    if ((jsscPort) != null) {
        try {
            jsscPort.closePort();
        } catch (jssc ex) {
            ex.printStackTrace(java.lang.System.out);
        }
    }
    if ((gpsMap.markSet) != null) {
        gpsMap.markSet.save();
    }
    try {
        prefs.flush();
    } catch (java.util.prefs.BackingStoreException ex) {
        ex.printStackTrace(java.lang.System.out);
    }
}