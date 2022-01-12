@java.lang.Override
public void run() {
    try {
        java.lang.String osName = java.lang.System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            processEventsMac();
        }else {
            processEventsWinLin();
        }
    } catch (java.lang.Exception ex) {
        java.util.logging.Logger.getLogger(nl.hyranasoftware.javagmr.threads.WatchDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}