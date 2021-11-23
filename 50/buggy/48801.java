@java.lang.Override
public void run() {
    if (android.text.TextUtils.equals(getCallState(), IMXCall.CALL_STATE_RINGING)) {
        onAnsweredElsewhere();
    }
}