public void setInactive(boolean state) {
    if ((scrollListener) == null)
        return ;
    
    isInactive = state;
    if (state) {
        setViewsVisibility(false);
        userRecyclerView.removeOnScrollListener(scrollListener);
        return ;
    }
    userRecyclerView.addOnScrollListener(scrollListener);
}