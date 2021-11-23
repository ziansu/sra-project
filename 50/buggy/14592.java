public void setInactive(boolean state) {
    isInactive = state;
    if (state) {
        setViewsVisibility(false);
        userRecyclerView.removeOnScrollListener(scrollListener);
        return ;
    }
    userRecyclerView.addOnScrollListener(scrollListener);
}