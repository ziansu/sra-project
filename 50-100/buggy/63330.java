protected void performDefaults() {
    java.lang.System.out.println("PERFORM DEFAULTS CALLED, SET CLEARED");
    com.soartech.soar.ide.ui.SoarEditorUIPlugin.getDefault().initializeDefaultPreferences(com.soartech.soar.ide.ui.SoarEditorUIPlugin.getDefault().getPreferenceStore());
    if ((keywordList) != null) {
        keywordList.setItems(oldKeywordSet.toArray(new java.lang.String[newKeywordSet.size()]));
    }
    newKeywordSet.clear();
}