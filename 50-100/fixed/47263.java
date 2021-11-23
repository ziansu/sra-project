@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    if ((mHeader) != null) {
        translateHeader(((mRecyclerView.getLayoutManager().getChildAt(0)) == (mHeader) ? mRecyclerView.computeVerticalScrollOffset() : mHeader.getHeight()));
    }
}