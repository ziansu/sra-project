@java.lang.Override
public void onClick() {
    is_timeout = false;
    timeoutCountDownTimer.cancel();
    setState(new com.ubicomp.ketdiary.TestActivity.Stage2State());
}