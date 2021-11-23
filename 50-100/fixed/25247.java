@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    if (((firstVisibleItem + visibleItemCount) >= totalItemCount) && (totalItemCount > 0)) {
        if ((((mObservations) != null) && (!(mIsLoading))) && ((mPage) >= 1)) {
            (mPage)++;
            reloadObservations();
        }
    }
}