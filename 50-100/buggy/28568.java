private void preload() {
    new android.os.CountDownTimer(3000, 1000) {
        @java.lang.Override
        public void onTick(long millisUntilFinished) {
        }

        @java.lang.Override
        public void onFinish() {
            android.content.Intent intent = new android.content.Intent(com.cs130.beatmarkr.SplashScreenActivity.this, com.cs130.beatmarkr.SongListActivity.class);
            startActivity(intent);
            finish();
        }
    }.start();
}