private void checkForRequests() {
    if (com.wolkabout.hexiwear.activity.ReadingsActivity.shouldVibrate) {
        com.wolkabout.hexiwear.activity.ReadingsActivity.shouldVibrate = false;
        vibrateWatch(com.wolkabout.hexiwear.activity.ReadingsActivity.vibrateDuration);
        com.wolkabout.hexiwear.activity.ReadingsActivity.vibrateDuration = com.wolkabout.hexiwear.activity.ReadingsActivity.vibrateDurationDefault;
    }
    final android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            checkForRequests();
        }
    }, 200);
}