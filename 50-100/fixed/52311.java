@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    controllers.MainWindowController.setMediaPaneController(this);
    try {
        loadingTask = new controllers.MediaPaneController.LoadingTask().call();
    } catch (java.lang.Exception ex) {
        java.util.logging.Logger.getLogger(controllers.MediaPaneController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}