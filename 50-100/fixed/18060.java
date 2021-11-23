private void scrolling() {
    detectTouchEventConsumed();
    if (isFirstViewVisible()) {
        if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_DOWN)) {
            isBeingDraggedFromTop();
        }
        if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_UP)) {
            isBeingDraggedFromTop();
        }
    }
}