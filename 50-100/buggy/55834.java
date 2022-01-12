@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        filter = intent.getStringExtra(SearchManager.QUERY);
        filterAndSortInBackground(filter, sortMode);
    }
    bibtexListView.requestFocus();
    hideKeyboard();
}