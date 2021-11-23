@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.android.booklistingapp.Book>> loader, java.util.List<com.example.android.booklistingapp.Book> data) {
    progressBar.setVisibility(View.GONE);
    android.widget.TextView emptyTextView = ((android.widget.TextView) (findViewById(android.R.id.empty)));
    emptyTextView.setText(R.string.empty_view_text);
    mAdapter.clear();
    if ((data != null) && (!(data.isEmpty()))) {
        mAdapter.addAll(data);
    }
}