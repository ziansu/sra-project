private void handleIntent(android.content.Intent intent) {
    if (intent.getAction().equals(Intent.ACTION_SEARCH)) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY);
        android.widget.Toast.makeText(mContext, query, Toast.LENGTH_SHORT).show();
        android.provider.SearchRecentSuggestions suggestions = new android.provider.SearchRecentSuggestions(this, com.quartzodev.provider.SuggestionProvider.AUTHORITY, com.quartzodev.provider.SuggestionProvider.MODE);
        suggestions.saveRecentQuery(query, null);
    }
}