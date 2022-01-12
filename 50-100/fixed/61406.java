@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        start();
    }else
        if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
            stop();
        }
    
    return false;
}