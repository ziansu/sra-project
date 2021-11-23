public void stop() {
    if (mRunning) {
        mRunning = false;
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Stopping game loop");
        mGameThread.quit();
        mGameThread = null;
        mGameHandler = null;
    }
}