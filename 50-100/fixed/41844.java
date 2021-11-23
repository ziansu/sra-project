private android.os.CountDownTimer createAndStartRebuyTimer() {
    if ((mSessionHolder.getRebuyTimeLeft()) > 0) {
        return new android.os.CountDownTimer(mSessionHolder.getRebuyTimeLeft(), 100) {
            @java.lang.Override
            public void onTick(long remainingMillis) {
                mSessionHolder.setRebuyTimeLeft(remainingMillis);
                net.chokethe.killerdealer.MainActivity.updateTimerUI(mRebuyTimerTextView, remainingMillis);
            }

            @java.lang.Override
            public void onFinish() {
                cancelTimerIfNotNull(mRebuyTimer);
                alertRebuyEnd();
            }
        }.start();
    }else {
        return null;
    }
}