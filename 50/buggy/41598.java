public void loadMixing(java.util.List<java.lang.Object> mixingList) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.MIXING;
    com.goka.kenburnsview.KenBurnsView.sCachedSizeForLoadType = 0;
    mMixingList = mixingList;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}