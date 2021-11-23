@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new android.os.CountDownTimer(((com.accountabilibuddies.accountabilibuddies.activity.SplashActivity.DELAY) * 1000), 1000) {
        @java.lang.Override
        public void onTick(long millisUntilFinished) {
        }

        @java.lang.Override
        public void onFinish() {
            finish();
            openMainView();
        }
    }.start();
}