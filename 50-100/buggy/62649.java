@java.lang.Override
public void run() {
    android.graphics.Canvas canvas = null;
    while (threadIsRunning) {
        try {
            canvas = surfaceHolder.lockCanvas(null);
            synchronized(surfaceHolder) {
                if (!(isGameOver)) {
                    gameStep();
                }
                updateView(canvas);
            }
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException ex) {
            android.util.Log.e(edu.augustana.csc490.countdown.startGameView.TAG, ex.toString());
        } finally {
            if (canvas != null)
                surfaceHolder.unlockCanvasAndPost(canvas);
            
        }
    } 
}