@java.lang.Override
public void onRefresh() {
    cursorInterface.updateCursor();
    ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swiperefresh))).setRefreshing(false);
}