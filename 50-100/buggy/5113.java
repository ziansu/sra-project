private void onError(java.lang.String errorMessage) {
    org.matrix.androidsdk.util.Log.e(im.vector.activity.LoginActivity.LOG_TAG, ("onForgotPasswordClick : requestEmailValidationToken fails with error " + errorMessage));
    if ((mMode) == (im.vector.activity.LoginActivity.MODE_FORGOT_PASSWORD)) {
        enableLoadingScreen(false);
        android.widget.Toast.makeText(getApplicationContext(), errorMessage, Toast.LENGTH_LONG).show();
        mMode = im.vector.activity.LoginActivity.MODE_LOGIN;
        showMainLayout();
        refreshDisplay();
    }
}