@java.lang.Override
public void run() {
    android.util.Log.d(LOG_TAG, "TaskPresenter");
    presentData();
    if (isRunning)
        timerPresenter.schedule(new obd2.dhbw.de.obd2_reader.MainActivity.TaskPresenter(), PRESENTER_INTERVAL);
    
}