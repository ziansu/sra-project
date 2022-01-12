@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    if (((firstVisibleItem + visibleItemCount) >= totalItemCount) && (!(isLoading))) {
        android.util.Log.d("GridView scroll: ", ((((("" + firstVisibleItem) + " ") + visibleItemCount) + " ") + totalItemCount));
        mCallbacks.onLoadMore();
        isLoading = true;
    }
}