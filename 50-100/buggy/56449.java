public void enableNavigationDotView(int viewCount) {
    if (viewCount > 1) {
        java.lang.System.out.println(("-------null == mNavigationDot: " + (null == (mNavigationDot))));
        if (null == (mNavigationDot)) {
            mNavigationDot = ((com.fmtech.fmdianping.widget.NavigationDot) (android.view.View.inflate(com.fmtech.fmdianping.base.widget.Flipper.getContext(), R.layout.navigation_dots, null)));
            addView(mNavigationDot);
        }
        mNavigationDot.setDotCount(viewCount);
    }
}