private org.eclipse.jface.preference.StringFieldEditor createUploadURLField(java.lang.String textFieldValue, java.lang.String textFieldLabel, java.lang.String textValue) {
    org.eclipse.jface.preference.StringFieldEditor textField = new org.eclipse.jface.preference.StringFieldEditor(textFieldValue, textFieldLabel, getFieldEditorParent());
    addField(textField);
    edu.illinois.codingspectator.monitor.ui.prefs.PrefsFacade.getInstance().getPreferenceStore().setValue(textFieldValue, textValue);
    return textField;
}