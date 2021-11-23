@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        android.util.Log.d("on action down", " down");
        start();
    }else
        if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
            android.util.Log.d("on action Up", " up");
            stop();
        }
    
    return false;
}