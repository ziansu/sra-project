private void stopTimerTask() {
    android.util.Log.i("MyMapsActivity", "stopTimerTask()");
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
}