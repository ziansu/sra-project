public synchronized boolean deleteAllFavorites() {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.clear();
    editor.apply();
    return true;
}