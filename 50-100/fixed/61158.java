@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    int counter = 0;
    while (retry && (counter < 1000)) {
        counter++;
        try {
            thread.setRunning(false);
            thread.join();
            retry = false;
            thread = null;
        } catch (java.lang.InterruptedException e) {
        }
    } 
}