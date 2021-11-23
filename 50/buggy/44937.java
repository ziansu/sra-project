@java.lang.Override
public void run() {
    runBackupButton.setDisable(value);
    if (!(loadBackup.getState().toString().equals("RUNNING"))) {
        cancelRunningBackupButton.setDisable((!value));
    }
}