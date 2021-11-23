public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    onTouchEvent(event);
    return super.dispatchTouchEvent(event);
}