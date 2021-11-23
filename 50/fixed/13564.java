public void createGui() {
    setJPopupMenu(createJPopupMenu());
    try {
        java.awt.SystemTray.getSystemTray().add(this);
    } catch (java.awt.AWTException e) {
        e.printStackTrace();
    }
}