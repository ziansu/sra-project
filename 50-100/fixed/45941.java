@javafx.fxml.FXML
private void initialize() {
    txtDecimalPlaces.textProperty().setValue(java.lang.Integer.toString(config.getDecimalPlaces()));
    cbBlackAndWhite.setSelected(config.getBlackAndWhiteMode());
    zoomer = new de.oth.smplsp.zoom.Zoomer();
    zoomer.init(this);
    zoomer.rescaleSettingsDialog();
}