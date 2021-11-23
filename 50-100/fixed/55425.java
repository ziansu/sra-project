private boolean mIsValidForm() {
    if (android.text.TextUtils.isEmpty(mEmail.getText().toString().trim())) {
        mEmail.setError("PLease input your email!");
        return false;
    }
    if (android.text.TextUtils.isEmpty(mPassword.getText().toString().trim())) {
        mPassword.setError("PLease input your password!");
        return false;
    }
    return true;
}