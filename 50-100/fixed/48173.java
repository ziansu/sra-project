private void logout() {
    android.content.SharedPreferences preferences = com.ichi2.anki.AnkiDroidApp.getSharedPrefs(getBaseContext());
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString("username", "");
    editor.putString("hkey", "");
    editor.commit();
    getCol().getMedia().forceResync();
    switchToState(com.ichi2.anki.MyAccount.STATE_LOG_IN);
}