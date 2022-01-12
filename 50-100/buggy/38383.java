@java.lang.Override
public void run() {
    if (sDrive.init()) {
        if (check()) {
            try {
                javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (java.lang.Exception e) {
                LOG.error("Exception on initialization", e);
            }
            preparePopupMenu();
        }else {
            java.lang.System.err.println("SystemTray not supported");
        }
    }
}