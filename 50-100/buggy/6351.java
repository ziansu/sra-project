@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.example.android.miwok.News>> loader, java.util.List<com.example.android.miwok.News> data) {
    android.view.View loadingIndicator = rootView.findViewById(R.id.loading_indicator);
    loadingIndicator.setVisibility(View.GONE);
    mEmptyStateTextView.setText(R.string.no_news);
    mAdapter.clear();
    if ((data != null) && (!(data.isEmpty()))) {
        mAdapter.addAll(data);
    }
}