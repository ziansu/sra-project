public void handleWindow(java.awt.Window window, int eventID) {
    ibcontroller.TwsListener.setMainWindow(((javax.swing.JFrame) (window)));
    if (ibcontroller.Settings.getBoolean("MinimizeMainWindow", false)) {
        ibcontroller.TwsListener.getMainWindow().setExtendedState(java.awt.Frame.ICONIFIED);
    }
}