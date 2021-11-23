public void handleWindow(java.awt.Window window, int eventID) {
    ibcontroller.TwsListener.setMainWindow(((javax.swing.JFrame) (window)), ibcontroller.Settings.getBoolean("MinimizeMainWindow", false));
}