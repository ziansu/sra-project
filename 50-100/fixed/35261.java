public void onNext(com.jakewharton.rxbinding.support.v7.widget.SearchViewQueryTextEvent event) {
    java.lang.CharSequence query = event.queryText();
    java.lang.String current = getIntent().getStringExtra(SearchManager.QUERY);
    if ((!(android.text.TextUtils.isEmpty(query))) && (!(query.equals(current)))) {
        android.content.Intent searchIntent = new android.content.Intent(this, org.tribler.android.SearchActivity.class);
        searchIntent.setAction(Intent.ACTION_SEARCH);
        searchIntent.putExtra(SearchManager.QUERY, query.toString());
        onNewIntent(searchIntent);
    }
}