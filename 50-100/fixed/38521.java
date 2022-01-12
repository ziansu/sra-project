public void startCountDown(final long miliseconds) {
    if ((mCountDownTimer) != null) {
        mCountDownTimer.cancel();
        mCountDownTimer = null;
    }
    renderTime(miliseconds);
    mCurrentTime = miliseconds;
    mCountDownTimer = new android.os.CountDownTimer(miliseconds, mInterval) {
        @java.lang.Override
        public void onTick(long millisUntilFinished) {
            mCurrentTime = millisUntilFinished;
            renderTime(millisUntilFinished);
        }

        @java.lang.Override
        public void onFinish() {
            renderTime(0);
            mCountDownTimer = null;
        }
    };
    mCountDownTimer.start();
}