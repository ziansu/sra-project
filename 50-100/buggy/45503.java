public void setUIScanLineColor(int color) {
    this.mScanLineColor = color;
    float r = android.graphics.Color.red(mScanLineColor);
    float g = android.graphics.Color.green(mScanLineColor);
    float b = android.graphics.Color.blue(mScanLineColor);
    com.vuforia.TrackerManager trackerManager = com.vuforia.TrackerManager.getInstance();
    com.vuforia.ObjectTracker objectTracker = ((com.vuforia.ObjectTracker) (trackerManager.getTracker(com.vuforia.ObjectTracker.getClassType())));
    com.vuforia.TargetFinder targetFinder = objectTracker.getTargetFinder();
    targetFinder.setUIScanlineColor(16, 22, 79);
}