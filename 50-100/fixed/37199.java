public void initializeView(org.mozilla.gecko.EventDispatcher eventDispatcher) {
    mLayerClient = new org.mozilla.gecko.gfx.GeckoLayerClient(getContext(), this, eventDispatcher);
    if ((mOverscroll) != null) {
        mLayerClient.setOverscrollHandler(mOverscroll);
    }
    mPanZoomController = mLayerClient.getPanZoomController();
    mToolbarAnimator = mLayerClient.getDynamicToolbarAnimator();
    mRenderer = new org.mozilla.gecko.gfx.LayerRenderer(this);
    setFocusable(true);
    setFocusableInTouchMode(true);
    org.mozilla.gecko.GeckoAccessibility.setDelegate(this);
}