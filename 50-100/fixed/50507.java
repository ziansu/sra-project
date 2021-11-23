@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent e, com.google.android.maps.MapView mapView) {
    switch (e.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            if (((mListener) != null) && (!(isMapMoving)))
                mListener.onMapStartedMoving();
            
            isBeingTouched = true;
            isMapMoving = true;
            break;
        case android.view.MotionEvent.ACTION_UP :
        case android.view.MotionEvent.ACTION_CANCEL :
            isBeingTouched = false;
            break;
    }
    return false;
}