public synchronized boolean putFavorite(java.lang.String imdbID, com.example.vineetpatil.moviesearch.TitleRecord titleRecord) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(imdbID, titleRecord.toString());
    editor.apply();
    return true;
}