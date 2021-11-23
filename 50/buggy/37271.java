void dispatchOnPanelSlide(android.view.View panel) {
    for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
        l.onPanelSlide(panel, mSlideOffset);
    }
}