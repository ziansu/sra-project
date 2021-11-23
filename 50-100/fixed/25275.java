@java.lang.Override
public void pause() {
    playing = false;
    wasPaused = true;
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
    if ((fiveSecsLessTimer) != null) {
        fiveSecsLessTimer.cancel();
    }
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e("Error:", "joining thread");
    }
}