protected void closeActionMode() {
    mTracks.unselectAll();
    if ((mActionMode) != null)
        mActionMode.finish();
    
}