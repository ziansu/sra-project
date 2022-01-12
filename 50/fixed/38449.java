public void onFinish() {
    if (!(testComplete)) {
        silentSpots += 10;
        vibrator.cancel();
        runTest();
    }
}