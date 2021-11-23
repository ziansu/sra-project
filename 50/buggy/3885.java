@java.lang.Override
public void call(java.lang.CharSequence charSequence) {
    if ((charSequence.length()) >= 3) {
        enableSendButton();
    }else {
        disableSendButton();
    }
}