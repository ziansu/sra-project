@android.annotation.SuppressLint(value = "NewApi")
public synchronized void onActivity() {
    cancel();
    inactivityTask = new io.github.marktony.espresso.zxing.utils.InactivityTimer.InactivityAsyncTask();
    inactivityTask.execute();
}