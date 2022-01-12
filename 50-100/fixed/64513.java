public void stop() {
    mManager.unregisterListener(mSensorEventListener, mAccelerometer);
    mEventThread.continueRunning = false;
    try {
        mEventThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    mGameEventListener.onGameEnd(ball.getScore());
    android.util.Log.d(fr.fstaine.theball.controller.GameEngine.TAG, "Game engine stopped");
}