@java.lang.Override
public com.chrynan.androidfeedscroll.EndlessScrollAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((recyclerView) == null) {
        recyclerView = ((android.support.v7.widget.RecyclerView) (parent));
        com.chrynan.androidfeedscroll.EndlessScrollAdapter.EndlessRecyclerOnScrollListener scrollListener = new com.chrynan.androidfeedscroll.EndlessScrollAdapter.EndlessRecyclerOnScrollListener(((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager())));
        recyclerView.setOnScrollListener(scrollListener);
    }
    return null;
}