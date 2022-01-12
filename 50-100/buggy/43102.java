@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.android.theguardiannewsapp.News>> loader, java.util.List<com.example.android.theguardiannewsapp.News> data) {
    progressBar.setVisibility(View.GONE);
    emptyTextView = ((android.widget.TextView) (findViewById(android.R.id.empty)));
    emptyTextView.setText(R.string.empty_view_text);
    mAdapter.clear();
    if ((data != null) && (!(data.isEmpty()))) {
        mAdapter.addAll(data);
        emptyTextView.setText(null);
    }
}