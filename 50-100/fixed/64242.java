@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    startCollectingData();
    timer = new android.os.CountDownTimer(10000, 1000) {
        @java.lang.Override
        public void onTick(long l) {
        }

        @java.lang.Override
        public void onFinish() {
            endTrial();
        }
    };
    timer.start();
}