@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (((event.getAction()) != (android.view.MotionEvent.ACTION_UP)) && ((event.getAction()) != (android.view.MotionEvent.ACTION_DOWN)))
        return false;
    
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        binder.setAccelerated(false);
        binder.setAccelerator(0);
    }else {
        binder.setAccelerated(true);
    }
    return true;
}