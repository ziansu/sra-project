private void scrolling() {
    detectTouchEventConsumed();
    if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_DOWN)) {
        if (isFirstViewVisible()) {
            isBeingDraggedFromTop();
        }
    }
    if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_UP)) {
        if ((headerLayoutParams.height) > (heightOfActionBar)) {
            isBeingDraggedFromTop();
        }
    }
}