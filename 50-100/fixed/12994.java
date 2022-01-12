private void stop() {
    if (mGame.hasStarted()) {
        ca.hoogit.powerhour.Game.Engine.started = false;
        if (mGame.is(State.ACTIVE)) {
            mTimer.cancel();
        }
        android.util.Log.i(ca.hoogit.powerhour.Game.Engine.TAG, ("Stopping game on round " + (mGame.currentRound())));
    }
    mVibrator.cancel();
    finish();
}