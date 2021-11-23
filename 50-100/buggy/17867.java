public static org.votingsystem.client.webextension.dialog.DocumentBrowserDialog showDialog() {
    if ((org.votingsystem.client.webextension.dialog.DocumentBrowserDialog.INSTANCE) == null)
        org.votingsystem.client.webextension.dialog.DocumentBrowserDialog.INSTANCE = new org.votingsystem.client.webextension.dialog.DocumentBrowserDialog(new org.votingsystem.client.webextension.pane.DocumentBrowserPane());
    
    javafx.application.Platform.runLater(() -> {
        javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
        fileChooser.setInitialDirectory(new java.io.File(java.lang.System.getProperty("user.home")));
        org.votingsystem.client.webextension.dialog.DocumentBrowserDialog.showDialog(fileChooser.showOpenDialog(new javafx.stage.Stage()));
    });
    return org.votingsystem.client.webextension.dialog.DocumentBrowserDialog.INSTANCE;
}