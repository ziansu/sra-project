private void handleIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY).trim();
        android.util.Log.d(diy.uigeneric.sampleserver.SampleServerListActivity.TAG, ("search type: " + query));
        list.search(query, listener);
    }
}