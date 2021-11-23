private void shutdown() {
    com.melloware.jintellitype.JIntellitype.getInstance().cleanUp();
    if (java.awt.SystemTray.isSupported()) {
        java.awt.SystemTray.getSystemTray().remove(trayIcon);
    }
}