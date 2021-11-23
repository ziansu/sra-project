@java.lang.Override
public void onTaskComplete(android.graphics.Movie movie) {
    mAdapter.appendImageData(movie);
    android.util.Log.i("DownloadTask Complete", "");
}