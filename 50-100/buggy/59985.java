@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case 1 :
            android.content.Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
            startActivityForResult(signInIntent, com.hl.homelanebuddy.login.LoginPresenter.RC_SIGN_IN);
            com.crashlytics.android.answers.Answers.getInstance().logCustom(new com.crashlytics.android.answers.CustomEvent("Login").putCustomAttribute("Customer", com.hl.homelanebuddy.login.LoginPresenter.mGoogleAccount.getEmail()));
        default :
            break;
    }
    return false;
}