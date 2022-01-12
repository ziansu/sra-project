public void updateScore(int delta) {
    scoreKeeperIcon.updateScore(delta);
    if (delta != 1) {
        scoreKeeperIcon.updateDelta(delta);
        new android.os.Handler(mContext.getMainLooper()).postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                scoreKeeperIcon.removeDelta();
            }
        }, 400);
    }
}