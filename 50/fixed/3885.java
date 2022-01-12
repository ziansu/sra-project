@java.lang.Override
public void call(java.lang.CharSequence charSequence) {
    if ((charSequence.length()) >= 1) {
        enableSendButton();
    }else {
        disableSendButton();
    }
}