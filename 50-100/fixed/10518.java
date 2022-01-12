public void start() {
    if (!(mRunning)) {
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Starting game loop");
        mRunning = true;
        mGameHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                tick();
            }
        });
    }
}