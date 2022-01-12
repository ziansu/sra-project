protected void setNewValue() {
    displayTime.setValue(getValueAsString());
    internalSetReadonlyFieldValue(getValueAsString());
    if ((changedHandler) != null) {
        changedHandler.onChanged(getValueAsString());
    }
}