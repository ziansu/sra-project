@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((drawThread) != null) {
        boolean retry = true;
        drawThread.setRunning(false);
        while (retry) {
            try {
                drawThread.join();
                retry = false;
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
        drawThread = null;
    }
}