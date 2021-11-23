private void readyScroller() {
    if (((scroller) == null) && ((pullTwinkEnable) || (autoLoadingEnable))) {
        if ((targetView) instanceof android.support.v7.widget.RecyclerView) {
            scroller = android.support.v4.widget.ScrollerCompat.create(getContext(), (scrollInterpolator = getRecyclerDefaultInterpolator()));
            addRecyclerScrollListener();
        }
        scroller = android.support.v4.widget.ScrollerCompat.create(getContext());
    }
}