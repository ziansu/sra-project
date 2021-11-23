@java.lang.Override
public void onError(java.lang.Throwable e) {
    e.printStackTrace();
    setErrorMessageAndRequestFocus(username, getString(R.string.error_incorrect_login));
    setErrorMessageAndRequestFocus(password, getString(R.string.error_incorrect_login));
}