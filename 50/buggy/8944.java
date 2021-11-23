@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mHandlerThread.quit();
    android.util.Log.v(TAG, "onDestroy");
}