@java.lang.Override
public void run() {
    if ((largeAndSmallCircleCurrentCenterX) <= (largeAndSmallCircleDestCenterX)) {
        mainHandler.removeCallbacks(this);
    }else {
        float v = ((largeAndSmallCircleCurrentCenterX) - (largeAndSmallCircleDestCenterX)) / (com.example.podslider.PodSlider.LARGE_CIRCLE_MOVE_TIME_IN_MS);
        largeAndSmallCircleCurrentCenterX -= v * (com.example.podslider.PodSlider.TIME_FOR_EACH_INCREMENT_IN_MS);
        invalidate();
        mainHandler.postDelayed(this, com.example.podslider.PodSlider.TIME_FOR_EACH_INCREMENT_IN_MS);
    }
}