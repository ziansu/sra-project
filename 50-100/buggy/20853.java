@java.lang.Override
public void run() {
    (milliseconds)++;
    if ((milliseconds) >= 100) {
        milliseconds = 0;
        (seconds)++;
        textView.setText(printResult());
        if ((seconds) == 60) {
            seconds = 0;
            (minutes)++;
        }
    }
    if (((minutes) == (roundMaxMinutes)) && ((seconds) == (roundMaxSeconds))) {
        stop(textView);
        isFinished = true;
        isRunning = false;
        resetTimer();
    }
}