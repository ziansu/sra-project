public boolean CanRefresh() {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    int firstItemPosition = layoutManager.findFirstVisibleItemPosition();
    if ((layoutManager.findViewByPosition(firstItemPosition)) == null) {
        return true;
    }
    return ((layoutManager.findViewByPosition(firstItemPosition).getTop()) == 0) && (firstItemPosition == 0) ? true : false;
}