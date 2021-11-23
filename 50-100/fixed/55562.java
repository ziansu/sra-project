private void updateProgressTextToThread() {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            backupProgressText.textProperty().unbind();
            backupProgressText.setText(backupToRunningBackupThreadMap.get(backupFileName.getText()).getMessage());
            backupProgressText.textProperty().bind(backupToRunningBackupThreadMap.get(backupFileName.getText()).messageProperty());
        }
    });
}