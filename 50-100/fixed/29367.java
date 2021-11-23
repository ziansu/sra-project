@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
    switch ((motionEvent.getAction()) & (android.view.MotionEvent.ACTION_MASK)) {
        case android.view.MotionEvent.ACTION_UP :
            if (!(gameEnded)) {
                mPlayerShip.stopBoost();
            }
            break;
        case android.view.MotionEvent.ACTION_DOWN :
            if (gameEnded) {
                init();
            }else {
                mPlayerShip.startBoost();
            }
            break;
    }
    return true;
}