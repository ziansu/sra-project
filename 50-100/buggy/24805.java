private void setWidgetStateAppropriately() {
    selected = mainConfigDialog.getCurrentConnection();
    if ((selected) == null) {
        dismiss();
    }
    commandIndex = selected.getAutoXType();
    origCommandIndex = selected.getAutoXType();
    spinnerAutoXType.setSelection(commandIndex);
    setRemoteWidthAndHeight();
    setSessionProg();
    setPwOption();
    checkboxAutoXUnixAuth.setChecked(selected.getAutoXUnixAuth());
    setAdvancedToggleState();
}