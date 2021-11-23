public void loadResourceIDs(java.util.List<java.lang.Integer> resourceIDs) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.ResourceID;
    mResourceIDs = resourceIDs;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}