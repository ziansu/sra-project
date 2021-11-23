@java.lang.Override
public void onClick(android.view.View v) {
    if (timerRunning) {
        startTimer();
    }else {
        stopTimer();
    }
}