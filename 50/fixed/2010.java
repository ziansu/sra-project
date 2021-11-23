private void bindPasswordToggle() {
    unmaskedPasswordTextBox.textProperty().bindBidirectional(maskedPasswordTextBox.textProperty());
    maskedPasswordTextBox.visibleProperty().bind(maskPasswordToggle.selectedProperty().not());
}