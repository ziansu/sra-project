@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    int topRowVerticalPosition = ((recyclerView == null) || ((recyclerView.getChildCount()) == 0)) ? 0 : recyclerView.getChildAt(0).getTop();
    swipeRefreshLayoutListView.setEnabled((topRowVerticalPosition == 0));
}