@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        filter = intent.getStringExtra(SearchManager.QUERY);
        filterAndSortInBackground(filter, sortMode);
    }
    if ((bibtexListView) != null) {
        bibtexListView.requestFocus();
        hideKeyboard();
    }
}