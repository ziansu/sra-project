void setEnableEditMode(boolean enable) {
    if ((mIsMultiSelectEnabled) == enable)
        return ;
    
    if (enable) {
        mShowHiddenSites = true;
        mShowSelfHostedSites = false;
    }else {
        mShowHiddenSites = false;
        mShowSelfHostedSites = true;
    }
    mIsMultiSelectEnabled = enable;
    mSelectedPositions.clear();
    if (enable) {
        loadSites();
    }
}