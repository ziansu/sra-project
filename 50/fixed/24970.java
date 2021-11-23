public void setPackageName(java.lang.String packageName) {
    android.content.SharedPreferences.Editor editor = getPrefs().edit();
    editor.putString(net.oldev.aDictOnCopy.DictionaryOnCopyService.SettingsModel.PREFS_PACKAGE_NAME, packageName);
    editor.commit();
    fireChangeEvent();
}