public void loadMixing(java.util.List<java.lang.Object> mixingList) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.MIXING;
    mMixingList = mixingList;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}