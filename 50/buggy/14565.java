private void setStyleToIndicateCommandFailure() {
    commandTextField.getStyleClass().remove(seedu.ezdo.ui.CommandBox.SUCCESS_STYLE_CLASS);
    commandTextField.getStyleClass().add(seedu.ezdo.ui.CommandBox.ERROR_STYLE_CLASS);
}