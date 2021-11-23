@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    int topRowVerticalPosition = ((recyclerView == null) || ((recyclerView.getChildCount()) == 0)) ? 0 : recyclerView.getChildAt(0).getTop();
    swipeRefreshLayout.setEnabled((topRowVerticalPosition >= 0));
}