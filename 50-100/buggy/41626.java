private void getAllFavorites() {
    android.util.Log.d(com.example.vineetpatil.moviesearch.FavoriteFragment.TAG, "getAllFavorites() called");
    java.util.List<com.example.vineetpatil.moviesearch.TitleRecord> titleRecords = favorites.getAllFavorites();
    if ((titleRecords != null) && (!(titleRecords.isEmpty()))) {
        for (com.example.vineetpatil.moviesearch.TitleRecord titleRecord : titleRecords) {
            android.util.Log.d(com.example.vineetpatil.moviesearch.FavoriteFragment.TAG, ("getAllFavorites() titleRecord : " + titleRecord));
        }
        this.searchResultAdapter.clear();
        this.searchResultAdapter.addAll(titleRecords);
    }
}