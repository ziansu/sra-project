@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    mRoom = VideoStreamingFragment.mRoom;
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            mX = event.getX();
            mY = event.getY();
            break;
    }
    return true;
}