public synchronized boolean putAllFavorite(java.util.List<com.example.vineetpatil.moviesearch.TitleRecord> titleRecords) {
    if ((titleRecords != null) && ((titleRecords.size()) > 0)) {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        for (com.example.vineetpatil.moviesearch.TitleRecord titleRecord : titleRecords) {
            editor.putString(titleRecord.getImdbID(), titleRecord.toString());
        }
        editor.apply();
        return true;
    }
    return false;
}