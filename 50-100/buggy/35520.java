@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (multiTouchListener.onTouchEvent(event)) {
        return true;
    }
    if (mGestureDetector.onTouchEvent(event)) {
        return true;
    }
    if ((mMenuLayout.getVisibility()) == (android.view.View.INVISIBLE)) {
        return mMapView.onTouchEvent(event);
    }
    return true;
}