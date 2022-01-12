private boolean validPasscode() {
    java.lang.String pass = et_Passcode.getText().toString().trim();
    if ((pass.length()) == 0) {
        pass = "0";
    }
    int passcode = java.lang.Integer.parseInt(pass);
    boolean ok = org.spinsuite.util.Env.validLoginPasscode(m_ctx, passcode);
    if (!ok) {
        org.spinsuite.util.Msg.toastMsg(m_ctx, getResources().getString(R.string.msg_PasscodeIsInvalid));
    }
    return ok;
}