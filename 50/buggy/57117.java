@java.lang.Override
public void timerEdited(boolean edited) {
    if (edited) {
        setResult(TimerDetails.RESULT_CHANGED);
    }else {
        setResult(TimerDetails.RESULT_NO_CHANGE);
    }
    finish();
}