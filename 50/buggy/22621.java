@android.annotation.SuppressLint(value = "NewApi")
public synchronized void onActivity() {
    cancel();
    inactivityTask = new io.github.marktony.espresso.zxing.utils.InactivityTimer.InactivityAsyncTask();
    if ((Build.VERSION.SDK_INT) >= 11) {
        inactivityTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }else {
        inactivityTask.execute();
    }
}