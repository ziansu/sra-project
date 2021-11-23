@com.google.common.eventbus.Subscribe
public void handleUpdaterFailedEvent(address.controller.UpdaterFailedEvent ufe) {
    javafx.application.Platform.runLater(() -> {
        address.controller.StatusBarFooterController.updaterStatusBar.setText(ufe.toString());
        address.controller.StatusBarFooterController.updaterStatusBar.setProgress(0.0);
        address.controller.StatusBarFooterController.updaterStatusBar.setText("");
        showSecondaryStatusBarLabel();
    });
}