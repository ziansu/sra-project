private void saveUserFilter() {
    android.content.SharedPreferences.Editor editor = getPreferences().edit();
    settings.writeToPreferences(editor);
    editor.apply();
}