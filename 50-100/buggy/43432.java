@java.lang.Override
public void fail(int i, java.lang.String s) {
    android.util.Log.d(com.centralink.account.AuthenticatorActivity.TAG, ((("login() - errCode = " + i) + ", errMsg = ") + s));
    android.widget.Toast.makeText(context, ("Login Fail!" + (com.centralink.account.CloudResConverter.getErrMsg(s))), Toast.LENGTH_LONG);
    setSubmitBtnEnabled(true);
}