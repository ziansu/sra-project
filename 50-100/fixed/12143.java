@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    timer = new android.os.CountDownTimer(2000, 1000) {
        @java.lang.Override
        public void onTick(long l) {
        }

        @java.lang.Override
        public void onFinish() {
            trialNum = 1;
            startTrial();
        }
    };
    timer.start();
}