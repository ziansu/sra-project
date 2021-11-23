private void setModeDescription() {
    final java.lang.String description = modeDescriptionTextField.getText();
    if ((description != null) && ((description.length()) > 0)) {
        mode.setDescription(description);
        setUnsavedChangesTitle();
    }
}