private boolean mIsValidForm() {
    if (android.text.TextUtils.isEmpty(mEmail.getText().toString())) {
        mEmail.setError("PLease input your email!");
        return false;
    }
    if (android.text.TextUtils.isEmpty(mPassword.getText().toString())) {
        mPassword.setError("PLease input your password!");
        return false;
    }
    return true;
}