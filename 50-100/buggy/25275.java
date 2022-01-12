@java.lang.Override
public void pause() {
    playing = false;
    wasPaused = true;
    timer.cancel();
    timer = null;
    fiveSecsLessTimer.cancel();
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e("Error:", "joining thread");
    }
}