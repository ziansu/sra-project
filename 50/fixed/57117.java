@java.lang.Override
public void timerEdited(boolean edited) {
    if (edited) {
        setResult(TimerDetails.RESULT_CHANGED);
    }
    finish();
}