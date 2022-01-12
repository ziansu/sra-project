@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<io.volcain.booklisting.model.Book>> loader, java.util.List<io.volcain.booklisting.model.Book> data) {
    mProgressBar.setVisibility(View.GONE);
    mEmptyTextView.setText(R.string.no_books_found);
    mAdapter.clear();
    if ((data != null) && ((data.size()) > 0))
        mAdapter.addAll(data);
    
}