private void startAnimation(com.yat3s.navigationtab.TabView tabView) {
    int currentIndex = this.indexOfChild(tabView);
    if (null != (mTabSelectedListener)) {
        mTabSelectedListener.onSelected(currentIndex);
    }
    if (currentIndex != (mLastIndex)) {
        if ((-1) != (mLastIndex)) {
            mTabViews.get(mLastIndex).cancelHighLight();
        }
        tabView.highLight();
        mLastIndex = currentIndex;
    }
}