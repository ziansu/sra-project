public void setAdapter(android.support.v7.widget.RecyclerView.Adapter adapter) {
    if (adapter == null) {
        return ;
    }
    if (adapter instanceof com.github.ybq.endless.EndlessAdapter) {
        recyclerView.setAdapter(adapter);
    }
    recyclerView.setAdapter(com.github.ybq.endless.EndlessAdapter.wrap(adapter, loadMoreView));
    mAdapter = ((com.github.ybq.endless.EndlessAdapter) (recyclerView.getAdapter()));
}