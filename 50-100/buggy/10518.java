public void start() {
    if (!(mRunning)) {
        mRunning = true;
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Starting game loop");
        mGameThread = new android.os.HandlerThread("GameThread-0");
        mGameThread.start();
        mGameHandler = new android.os.Handler(mGameThread.getLooper());
        mGameHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                tick();
            }
        });
    }
}