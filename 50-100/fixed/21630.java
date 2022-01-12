private void clear() {
    android.view.View pageFill = getPageFill();
    android.view.View pageFree = getPageFree();
    detachViewFromParent(pageFill);
    org.looa.demoaboutlayout.LayoutParams params = ((org.looa.demoaboutlayout.LayoutParams) (pageFree.getLayoutParams()));
    params.topMargin = 0;
    pageFree.setLayoutParams(params);
    invalidate();
    requestLayout();
    setPageFill(pageFree);
    setPageFree(pageFill);
}