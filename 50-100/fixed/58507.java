public int getSpanCount(android.support.v7.widget.RecyclerView parent) {
    int spanCount = -1;
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
    if (layoutManager instanceof android.support.v7.widget.GridLayoutManager) {
        spanCount = ((android.support.v7.widget.GridLayoutManager) (layoutManager)).getSpanCount();
    }else
        if (layoutManager instanceof android.support.v7.widget.StaggeredGridLayoutManager) {
            spanCount = ((android.support.v7.widget.StaggeredGridLayoutManager) (layoutManager)).getSpanCount();
        }
    
    return spanCount;
}