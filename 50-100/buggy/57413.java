private int caseStaggeredGrid(android.support.v7.widget.RecyclerView.LayoutManager layoutManager) {
    android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = ((android.support.v7.widget.StaggeredGridLayoutManager) (layoutManager));
    if ((lastScrollPositions) == null) {
        lastScrollPositions = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findLastVisibleItemPositions(lastScrollPositions);
        return findMax(lastScrollPositions);
    }
    return 0;
}