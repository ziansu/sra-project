@java.lang.Override
public void onClick(android.view.View v) {
    if (timerRunning) {
        stopTimer();
    }else {
        startTimer();
    }
}