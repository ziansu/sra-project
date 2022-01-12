private void checkIfReadyToProvide() {
    if (!(mLoading)) {
        return ;
    }
    int totalItemCount = mLayoutManager.getItemCount();
    int visibleItemCount = mLayoutManager.getChildCount();
    int pastVisiblesItems = mLayoutManager.findFirstVisibleItemPosition();
    if ((visibleItemCount + pastVisiblesItems) >= totalItemCount) {
        mLoading = false;
        provideData();
    }
}