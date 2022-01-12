@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    createLifeList();
    if ((gameLoopThread.getState()) == (java.lang.Thread.State.NEW)) {
        gameLoopThread.setRunning(true);
        gameLoopThread.start();
        java.lang.Runnable task = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                scores.score = (scores.score) + 1;
                handler.postDelayed(this, 500);
            }
        };
        handler.removeCallbacks(task);
        handler.post(task);
    }
}