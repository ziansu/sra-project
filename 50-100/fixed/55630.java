@java.lang.Override
public void run() {
    android.graphics.Canvas canvas;
    android.util.Log.d(ac.robinson.bettertogether.plugin.base.cardgame.player.PlayerThread.TAG, "Starting game loop for player");
    while (running) {
        canvas = null;
        try {
            canvas = this.surfaceHolder.lockCanvas();
            synchronized(surfaceHolder) {
                if (canvas != null)
                    this.gamePanel.render(canvas, true);
                
            }
        } finally {
            if (canvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    } 
}