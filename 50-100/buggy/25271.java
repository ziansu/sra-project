@java.lang.Override
public void run() {
    android.graphics.Canvas canvas = null;
    while (isRunning) {
        try {
            synchronized(surfaceHolder) {
                canvas = surfaceHolder.lockCanvas(null);
                doDraw(canvas);
                java.lang.Thread.sleep(50);
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } finally {
            if ((canvas != null) && ((surfaceHolder) != null)) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    } 
}