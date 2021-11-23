@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if (validDevice) {
        int eventaction = event.getAction();
        switch (eventaction) {
            case android.view.MotionEvent.ACTION_DOWN :
                break;
            case android.view.MotionEvent.ACTION_MOVE :
                if (!(startedTest)) {
                    startTest();
                    interrupted = false;
                }
                break;
            case android.view.MotionEvent.ACTION_UP :
                if (!(interrupted)) {
                    interrupted();
                }
                break;
        }
        return true;
    }
    return false;
}