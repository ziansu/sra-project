@java.lang.Override
public void onSuccess(final com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserSession userSession, final com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice newDevice) {
    android.util.Log.i(com.amazonaws.mobilehelper.auth.signin.CognitoUserPoolsSignInProvider.LOG_TAG, ("Logged in. " + (userSession.getIdToken())));
    cognitoUserSession = userSession;
    if (null != (resultsHandler)) {
        resultsHandler.onSuccess(this);
    }
    initializedLatch.countDown();
}