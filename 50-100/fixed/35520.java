@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (multiTouchListener.onTouchEvent(event)) {
    }
    if (mMapView.onTouchEvent(event)) {
    }
    if (mGestureDetector.onTouchEvent(event)) {
    }else {
    }
    return true;
}