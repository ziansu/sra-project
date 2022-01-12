@java.lang.Override
public void run() {
    long elapsed = (android.os.SystemClock.uptimeMillis()) - start;
    float t = java.lang.Math.max((1 - (interpolator.getInterpolation((((float) (elapsed)) / duration)))), 0);
    marker.setAnchor(0.5F, (1.0F + (14 * t)));
    if (t > 0.0) {
        handler.postDelayed(this, 15);
    }else {
        marker.showInfoWindow();
    }
}