@java.lang.Override
public void run() {
    backupProgressText.textProperty().unbind();
    backupProgressText.setText(backupToRunningBackupThreadMap.get(backupFileName.getText()).getMessage());
    backupProgressText.textProperty().bind(backupToRunningBackupThreadMap.get(backupFileName.getText()).messageProperty());
}