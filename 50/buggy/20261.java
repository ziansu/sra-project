public void createFieldEditors() {
    addField(new org.eclipse.jface.preference.DirectoryFieldEditor(PreferenceConstants.P_ROOTPROJECT_PATH, "&Gradle root project path:", getFieldEditorParent()));
    addField(new org.eclipse.jface.preference.DirectoryFieldEditor(PreferenceConstants.P_JAVA_HOME_PATH, "&JAVA HOME set for gradle:", getFieldEditorParent()));
}