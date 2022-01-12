@java.lang.Override
public void onScroll(int l, int scrollPosition) {
    int headerHeight = (mHeader.getHeight()) - (net.atomarea.flowx.ui.ContactDetailsActivity.mToolbar.getHeight());
    float ratio = 0;
    if ((scrollPosition > 0) && (headerHeight > 0))
        ratio = ((float) (java.lang.Math.min(java.lang.Math.max(scrollPosition, 0), headerHeight))) / headerHeight;
    
    updateActionBarTransparency(ratio);
    updateParallaxEffect(scrollPosition);
}