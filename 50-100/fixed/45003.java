@java.lang.Override
public void onTick(long millisUntilFinished) {
    if (isPaused) {
        cancel();
    }else {
        counter.setText(("" + (millisUntilFinished / 1000)));
        timeRemaining = millisUntilFinished;
        speaking(array);
        textCounting(millisUntilFinished, array);
    }
}