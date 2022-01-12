private void scrolling() {
    detectTouchEventConsumed();
    if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_DOWN)) {
        if (isFirstViewVisible()) {
            android.util.Log.e("PullToScaleHeader", ("向下滚动" + (mLastDistance)));
            isBeingDraggedFromTop();
        }
    }
    if ((currentMode) == (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.SCROLL_UP)) {
        if ((headerLayoutParams.height) > (heightOfActionBar)) {
            android.util.Log.e("PullToScaleHeader", ("向上滚动" + (mLastDistance)));
            isBeingDraggedFromTop();
        }
    }
}