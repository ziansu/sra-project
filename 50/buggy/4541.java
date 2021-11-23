@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.example.android.newsapp.Story>> loader, java.util.List<com.example.android.newsapp.Story> data) {
    mDataset.addAll(data);
    mAdapter.notifyDataSetChanged();
}