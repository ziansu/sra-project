@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    while (retry) {
        try {
            thread.join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
        }
    } 
}