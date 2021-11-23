@java.lang.Override
public boolean canSwipeRefreshChildScrollUp() {
    return ((mRecyclerView) != null) && (android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1)));
}