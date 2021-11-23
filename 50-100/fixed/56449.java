public void enableNavigationDotView(int viewCount) {
    if (viewCount > 1) {
        if (null == (mNavigationDot)) {
            mNavigationDot = ((com.fmtech.fmdianping.widget.NavigationDot) (android.view.View.inflate(com.fmtech.fmdianping.base.widget.Flipper.getContext(), R.layout.navigation_dots, null)));
            addView(mNavigationDot);
        }
        mNavigationDot.setDotCount(viewCount);
    }
}