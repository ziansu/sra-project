private boolean processTouchEvent(android.view.MotionEvent ev) {
    boolean processed;
    final int action = ev.getAction();
    switch (action) {
        case android.view.MotionEvent.ACTION_MOVE :
            {
                processed = processMove(ev);
                break;
            }
        case android.view.MotionEvent.ACTION_UP :
            {
                processed = processActionUp(ev);
                break;
            }
        case android.view.MotionEvent.ACTION_CANCEL :
            {
                processed = processActionCancel(ev);
                break;
            }
        default :
            {
                processed = false;
            }
    }
    invalidate();
    return processed;
}