@java.lang.Override
public void run() {
    android.graphics.Canvas canvas;
    android.util.Log.d(ac.robinson.bettertogether.plugin.base.cardgame.dealer.DealerThread.TAG, "Starting game loop for dealer");
    while (running) {
        canvas = null;
        try {
            canvas = this.surfaceHolder.lockCanvas();
            synchronized(surfaceHolder) {
                this.gamePanel.render(canvas);
            }
        } finally {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    } 
}