private boolean isTopVisible(android.support.v7.widget.RecyclerView recyclerView) {
    int position = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    if (position == 0)
        return true;
    else
        return false;
    
}