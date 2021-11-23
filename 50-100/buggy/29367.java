@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
    switch ((motionEvent.getAction()) & (android.view.MotionEvent.ACTION_MASK)) {
        case android.view.MotionEvent.ACTION_UP :
            mPlayerShip.stopBoost();
            break;
        case android.view.MotionEvent.ACTION_DOWN :
            mPlayerShip.startBoost();
            if (gameEnded) {
                android.util.Log.d("bbb", ("starting game with touch :" + (gameEnded)));
                init();
            }
            break;
    }
    return true;
}