@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    settingsController.loadScreen(ScreensFramework.ZT_EDIT_SCREEN, ScreensFramework.ZT_EDIT_SCREEN_FXML);
    settingsController.loadScreen(ScreensFramework.KM_CK_SCREEN, ScreensFramework.KM_CK_SCREEN_FXML);
    settingsController.loadScreen(ScreensFramework.QC_SETTINGS_SCREEN, ScreensFramework.QC_SETTINGS_SCREEN_FXML);
    settingsController.loadScreen(ScreensFramework.CHANGE_PW_SCREEN, ScreensFramework.CHANGE_PW_SCREEN_FXML);
    settingsController.loadScreen(ScreensFramework.ROOT_SETTINGS_SCREEN, ScreensFramework.ROOT_SETTINGS_SCREEN_FXML);
    settingsController.loadScreen(ScreensFramework.LINK_SCREEN, ScreensFramework.LINK_SCREEN_FXML);
    settingsStack.getChildren().add(settingsController);
}