private final void changeSetting(int index) {
    java.lang.Enum value = enumerationValues[index];
    changeButton.setHint(value.name());
    changeButton.setText(getLabel(index));
    changeButton.setContentDescription(getDescription(index));
    org.nbp.calculator.SavedSettings.set(settingName, value);
    if ((changeHandler) != null) {
        changeHandler.handleEnumerationChange(value);
    }
}