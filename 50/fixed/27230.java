@javafx.fxml.FXML
private void mosaicFilter() throws java.io.IOException {
    openDialog("/Views/MosaicDialog.fxml");
    updateHistogram(fullColorFiltered.getImage());
}