@javafx.fxml.FXML
private void handleSelect(javafx.event.ActionEvent e) {
    java.lang.System.out.println("seeeelected");
    if ((settingsList.getSelectionModel().getSelectedItem()) != null) {
        java.lang.System.out.println(settingsList.getSelectionModel().getSelectedItem());
        this.savedSetts = new application.SettingsSaver();
        this.savedSetts = this.savedSetts.loadSettings(settingsList.getSelectionModel().getSelectedItem());
        this.uiController.setUpSliderFromSaved(this.savedSetts);
    }
}