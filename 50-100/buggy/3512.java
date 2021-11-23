@java.lang.Override
public void onSuccess(final com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession userSession, final com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice newDevice) {
    android.util.Log.i(com.amazonaws.mobilehelper.auth.signin.CognitoUserPoolsSignInProvider.LOG_TAG, ("Logged in. " + (userSession.getIdToken())));
    cognitoUserSession = userSession;
    if (null != (resultsHandler)) {
        com.amazonaws.mobilehelper.util.ViewHelper.showDialog(activity, activity.getString(R.string.title_activity_sign_in), (((activity.getString(R.string.login_success)) + " ") + (userSession.getIdToken())));
        resultsHandler.onSuccess(this);
    }
    initializedLatch.countDown();
}