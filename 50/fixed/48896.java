@java.lang.Override
public void onClick() {
    is_timeout = false;
    if ((timeoutCountDownTimer) != null)
        timeoutCountDownTimer.cancel();
    
    setState(new com.ubicomp.ketdiary.TestActivity.Stage2State());
}