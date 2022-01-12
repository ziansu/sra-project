@java.lang.Override
protected java.lang.Exception doInBackground(java.lang.Void... params) {
    cat.ie.challengeaccepted.WS.ChallengeAcceptedWsServiceSoapBinding service = new cat.ie.challengeaccepted.WS.ChallengeAcceptedWsServiceSoapBinding();
    cat.ie.challengeaccepted.WS.User user = new cat.ie.challengeaccepted.WS.User();
    user.email = mEmail;
    user.password = mPassword;
    java.lang.System.out.println(user.email);
    java.lang.System.out.println(user.password);
    try {
        showProgress(true);
        android.util.Log.i("LOGIN", "LogIn");
        remoteUser = service.logIn(user);
    } catch (java.lang.Exception e) {
        return e;
    }
    return null;
}