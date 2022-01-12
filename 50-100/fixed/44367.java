private void updateSections() {
    if ((getView()) == null)
        return ;
    
    mAdapter = new net.xpece.material.navigationdrawer.list.NavigationListAdapter(mSections);
    mAdapter.setActivatedItem(mLastSelected);
    mListView.setAdapter(mAdapter);
    mPinnedContainer.getViewTreeObserver().addOnGlobalLayoutListener(mPinnedContainerOnGlobalLayoutListener);
}