@java.lang.Override
public void onAnimate(int value) {
    if ((mHeaderIndicatorLocation) != (com.yat3s.chopin.ChopinLayout.INDICATOR_LOCATION_BACK)) {
        mHeaderIndicatorView.translateVerticalWithOffset(value);
    }
    if (null != (mRefreshHeaderIndicatorProvider)) {
        int progress = (100 * (java.lang.Math.abs(value))) / (mHeaderIndicatorView.getHeight());
        mRefreshHeaderIndicatorProvider.onHeaderIndicatorViewScrollChange(progress);
    }
}