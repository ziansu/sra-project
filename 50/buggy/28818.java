public int getFirstVisibleScrollPosition() {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    int firstVisiblePosition = layoutManager.findFirstVisibleItemPosition();
    return firstVisiblePosition;
}