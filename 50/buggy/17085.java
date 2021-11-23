private boolean onTouchEvent(android.view.View v, android.view.MotionEvent e) {
    if (!(mClickDetector.onTouchEvent(v, e))) {
        return false;
    }
    return super.onTouchEvent(e);
}