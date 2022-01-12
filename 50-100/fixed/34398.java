public void initialize(java.lang.String title, java.lang.String layerName, java.lang.String epsg) {
    this.setHeadingText(title);
    this.layerName.setText(layerName);
    this.projectionName.setValue(null);
    this.vectorFormatCombo.setValue(null);
    this.urlTextField.clear();
    this.geoDataTextArea.clear();
    this.file.clear();
    this.gitHubImportTab.clearFileGrid();
}