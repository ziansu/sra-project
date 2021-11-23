void dispatchOnPanelSlide(android.view.View panel) {
    synchronized(mPanelSlideListeners) {
        for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
            l.onPanelSlide(panel, mSlideOffset);
        }
    }
}