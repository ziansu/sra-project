void onDetach(com.facebook.litho.LithoView lithoView) {
    for (int i = 0, size = mViewPagerListeners.size(); i < size; i++) {
        com.facebook.litho.IncrementalMountHelper.ViewPagerListener viewPagerListener = mViewPagerListeners.get(i);
        viewPagerListener.release();
    }
    mViewPagerListeners.clear();
    lithoView.setDoesOwnIncrementalMount(false);
}