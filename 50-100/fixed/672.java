private void handleIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        query = intent.getStringExtra(SearchManager.QUERY).toLowerCase().trim().replaceAll("\\s+", "");
        fullQueryURL = ((com.example.android.booklistingapp.ListingActivity.GOOGLE_BOOKS_URL) + (query)) + (com.example.android.booklistingapp.ListingActivity.MAX_RESULTS);
        android.util.Log.v(com.example.android.booklistingapp.ListingActivity.LOG_TAG, ("Search Q: " + (query)));
    }
}