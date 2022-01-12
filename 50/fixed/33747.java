private void savePreferences() {
    editor.edit().putBoolean("music", musicOn).apply();
}