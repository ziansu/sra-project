@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<io.volcain.booklisting.model.Book>> loader, java.util.List<io.volcain.booklisting.model.Book> data) {
    if ((mProgressBar) != null)
        mProgressBar.setVisibility(View.GONE);
    
    if ((mEmptyTextView) != null)
        mEmptyTextView.setText(R.string.no_books_found);
    
    if ((mAdapter) != null)
        mAdapter.clear();
    
    if ((data != null) && ((data.size()) > 0)) {
        mAdapter.addAll(data);
    }
}