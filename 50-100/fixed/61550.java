private boolean processTouchEvent(android.view.MotionEvent ev) {
    boolean processed = true;
    final int action = ev.getAction();
    switch (action) {
        case android.view.MotionEvent.ACTION_MOVE :
            {
                processed = processMove(ev);
                break;
            }
        case android.view.MotionEvent.ACTION_UP :
        case android.view.MotionEvent.ACTION_CANCEL :
            {
                processActionUp(ev);
                break;
            }
    }
    invalidate();
    return processed;
}