@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    boolean loadMore = (firstVisibleItem + visibleItemCount) >= totalItemCount;
    if (loadMore && ((newsThread.getStatus()) == (AsyncTask.Status.FINISHED))) {
        com.example.root.douclient.fragments.NewsFragment.NewsThread newsThread = new com.example.root.douclient.fragments.NewsFragment.NewsThread();
        newsThread.execute();
    }
}