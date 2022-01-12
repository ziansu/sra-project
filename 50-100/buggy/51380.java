@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.www.bookworms.Book>> loader, java.util.List<com.example.www.bookworms.Book> books) {
    mEmptyStateTextView.setText(R.string.no_books);
    mProgressBar.setVisibility(android.view.View.GONE);
    if ((books != null) && (!(books.isEmpty()))) {
        mAdapter.addAll(books);
    }
}