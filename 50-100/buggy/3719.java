private void handleIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY);
        android.database.Cursor cursor = mSqlHelper.searchHeroListForHeroName(query);
        mCursorAdapter.changeCursor(cursor);
        mCursorAdapter.notifyDataSetChanged();
    }
}