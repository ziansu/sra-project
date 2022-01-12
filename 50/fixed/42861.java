@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.chiragawale.folinsight.entity.Follower>> loader, java.util.List<com.chiragawale.folinsight.entity.Follower> data) {
    mFollowerAdapter.clear();
    mFollowerAdapter.addAll(data);
    progressBar.setVisibility(View.INVISIBLE);
}