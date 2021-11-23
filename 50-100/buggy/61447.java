@java.lang.Override
public void onClick(android.view.View v) {
    new android.os.CountDownTimer(60000, 1000) {
        public void onTick(long millisUntilFinished) {
            mTvtimeRemain.setText(java.lang.Long.toString((millisUntilFinished / 1000)));
        }

        public void onFinish() {
            btWrite.setText("Start");
            closeUsbSerial();
        }
    }.start();
    openUsbSerial();
}