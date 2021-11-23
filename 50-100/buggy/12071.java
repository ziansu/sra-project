@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    mGoogleApiClient.disconnect();
    if (status.isSuccess()) {
        com.facebook.login.LoginManager.getInstance().logOut();
        mSharedPreferencesHelper.setLastSignInMethod(SharedPreferencesHelper.LAST_SIGN_IN_METHOD_NONE);
        mSharedPreferencesHelper.setFacebookToken(null);
        mSharedPreferencesHelper.setGoogleToken(null);
        callback.onSuccess();
    }else {
        callback.onError();
    }
}