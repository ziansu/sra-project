private void handleIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY);
        cursor = com.example.adao1.project2.DatabaseHelper.getInstance(this).getShop(query);
        searchCursorAdapter.swapCursor(cursor);
        searchCursorAdapter.notifyDataSetChanged();
    }
}