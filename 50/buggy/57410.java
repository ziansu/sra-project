@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    android.os.CountDownTimer timer = new android.os.CountDownTimer(8000, 1000) {
        @java.lang.Override
        public void onTick(long l) {
        }

        @java.lang.Override
        public void onFinish() {
            sayInitialInstructions();
        }
    };
    timer.start();
}