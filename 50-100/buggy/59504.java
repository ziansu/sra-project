@java.lang.Override
public void onResultViewCreated(android.view.View container, final android.widget.ListView listView, android.view.View mapView) {
    mPanel.setScrollableViewHelper(new com.sothree.slidinguppanel.ScrollableViewHelper() {
        @java.lang.Override
        public int getScrollableViewScrollPosition(android.view.View scrollableView, boolean isSlidingUp) {
            if (mResultsFragment.isMapShowing()) {
                return 1;
            }else {
                return super.getScrollableViewScrollPosition(listView, isSlidingUp);
            }
        }
    });
    mPanel.setScrollableView(container);
}