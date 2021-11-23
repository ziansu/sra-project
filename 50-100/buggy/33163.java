@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.android.booklistingproject_udacity.Book>> loader, java.util.List<com.example.android.booklistingproject_udacity.Book> books) {
    mProgressBarView.setVisibility(android.view.View.GONE);
    mEmptyStateTextView.setText(R.string.empty_list);
    mAdapter.clear();
    if ((books != null) && (!(books.isEmpty()))) {
        mAdapter.addAll(books);
    }
    (com.example.android.booklistingproject_udacity.BookActivity.loaderID)++;
}