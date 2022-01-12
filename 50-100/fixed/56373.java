private void doStartup() {
    if (isStateChanged()) {
        if (com.password.locker.util.Utils.isPassKeeperAlreadyRunning()) {
            javax.swing.JOptionPane.showMessageDialog(null, ("Error an instance of the application " + "is already running."));
            com.password.locker.StateMonitor.setState(AppState.SHUTDOWN);
            return ;
        }
        com.password.locker.Main.appStart();
    }
}