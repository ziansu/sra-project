@java.lang.Override
protected void onPause() {
    android.util.Log.e(bluemix.ruazosa.fer.hr.bluemix.MainActivity.TAG, "onPause");
    stopBackgroundThread();
    super.onPause();
}