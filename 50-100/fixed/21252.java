@java.lang.Override
public void onStateChange(int eventType, java.lang.Object object) {
    switch (eventType) {
        case nu.yona.app.state.EventChangeManager.EVENT_PASSCODE_STEP_ONE :
            loadPasscodeView();
            break;
        case nu.yona.app.state.EventChangeManager.EVENT_PASSCODE_STEP_TWO :
            loadVerifyPasscodeView();
            if (android.text.TextUtils.isEmpty(first_passcode)) {
                first_passcode = ((java.lang.String) (object));
            }else {
                validatePasscode(((java.lang.String) (object)));
            }
            break;
        case nu.yona.app.state.EventChangeManager.EVENT_PASSCODE_ERROR :
            passcode_error.setText(((java.lang.String) (object)));
            break;
        default :
            break;
    }
}