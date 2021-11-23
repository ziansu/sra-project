@hugo.weaving.DebugLog
private void updateSections() {
    if ((getView()) == null)
        return ;
    
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT)) {
        mListView.setAdapter(null);
    }
    mAdapter = new net.xpece.material.navigationdrawer.list.NavigationListAdapter(mSections);
    mAdapter.setActivatedItem(mLastSelected);
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT)) {
        if ((mHeader) != null)
            mListView.addHeaderView(mHeader);
        
    }
    mListView.setAdapter(mAdapter);
    mPinnedContainer.getViewTreeObserver().addOnGlobalLayoutListener(mPinnedContainerOnGlobalLayoutListener);
}