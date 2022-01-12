@java.lang.Override
public void call(java.lang.Throwable throwable) {
    timber.log.Timber.e(throwable, "login error");
    hideSpinner();
    if (throwable instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
        timber.log.Timber.d("starting recover activity");
        startActivityForResult(((com.google.android.gms.auth.UserRecoverableAuthException) (throwable)).getIntent(), de.bitdroid.flooding.ui.LoginActivity.REQUEST_CODE_AUTH);
    }else
        if (throwable instanceof java.io.IOException) {
            new android.app.AlertDialog.Builder(this).setTitle(R.string.error_login_title).setMessage(R.string.error_login_message).setPositiveButton(android.R.string.ok, null).show();
        }
    
}