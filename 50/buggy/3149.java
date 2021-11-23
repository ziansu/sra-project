public void setBallSpeed(float bSpeed) {
    com.elena.latencymeter.AnimationView.speed = bSpeed;
    multiplier = MainActivity.multiplier;
    com.elena.latencymeter.AnimationView.samples = MainActivity.samples;
    com.elena.latencymeter.AnimationView.showChart = false;
    tvSpeed.setText(java.lang.String.format("speed\n%.2f rad/s", com.elena.latencymeter.AnimationView.speed));
}