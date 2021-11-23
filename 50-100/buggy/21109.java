public void run() {
    double amp = mSensor.getAmplitude();
    android.util.Log.e("Noise", ("runnable mPollTask " + amp));
    if (amp > (mThreshold)) {
        callForHelp(amp);
        android.util.Log.e("Noise", "==== onCreate ===");
    }
    mHandler.postDelayed(mPollTask, com.example.jackson.gameuebung_3.MGDExerciseActivity.POLL_INTERVAL);
}