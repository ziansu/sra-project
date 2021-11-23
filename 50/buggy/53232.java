public synchronized boolean deleteFavorite(java.lang.String imdbID) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.remove(imdbID);
    editor.apply();
    return true;
}