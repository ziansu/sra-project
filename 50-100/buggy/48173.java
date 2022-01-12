private void logout() {
    android.content.SharedPreferences preferences = com.ichi2.anki.AnkiDroidApp.getSharedPrefs(getBaseContext());
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString("username", "");
    editor.putString("hkey", "");
    editor.commit();
    try {
        getCol().getMedia().forceResync();
    } catch (android.database.sqlite.SQLiteException e) {
        timber.log.Timber.e("MyAccount.logout()  reinitializing media db due to sqlite error");
        getCol().getMedia()._initDB();
    }
    switchToState(com.ichi2.anki.MyAccount.STATE_LOG_IN);
}