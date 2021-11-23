private void bindPasswordToggle() {
    unmaskedPasswordTextBox.textProperty().bindBidirectional(maskedPasswordTextBox.textProperty());
    unmaskedPasswordTextBox.visibleProperty().bind(maskPasswordToggle.selectedProperty().not());
}