@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.phendev.booksearch.Book>> loader, java.util.List<com.phendev.booksearch.Book> books) {
    android.view.View loadingIndicator = findViewById(R.id.loading_indicator);
    loadingIndicator.setVisibility(View.GONE);
    mEmptyStateTextView.setText(noBooksFound);
    mBookAdapter.clear();
    if ((books != null) && (!(books.isEmpty()))) {
        mBookAdapter.addAll(books);
        mEmptyStateTextView.setVisibility(View.GONE);
    }
}