@java.lang.Override
public void run() {
    if ((donutProgress.getProgress()) > (level)) {
        donutProgress.setProgress(0);
    }
    donutProgress.setProgress(((donutProgress.getProgress()) + 1));
    if ((donutProgress.getProgress()) == (level)) {
        android.util.Log.e("stop", "must stop");
        timer.cancel();
    }
}