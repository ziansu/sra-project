@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    while (retry) {
        try {
            thread.setRunning(false);
            thread.join();
            pitchDetector.setRunning(false);
            pitchDetector.stop();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        retry = false;
    } 
}