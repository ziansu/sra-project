public boolean onTouchEvent(android.view.MotionEvent e) {
    switch (e.getAction()) {
        case android.view.MotionEvent.ACTION_UP :
            android.util.Log.i(TAG, "Screen touched ");
            break;
        default :
            break;
    }
    return true;
}