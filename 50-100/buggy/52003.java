@butterknife.OnClick(value = R.id.linear_splash_login_google)
void onGoogleLoginClick() {
    io.caly.calyandroid.util.Logger.d(io.caly.calyandroid.fragment.TAG, "onclick");
    android.content.Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(presenter.getGoogleApiClient());
    startActivityForResult(signInIntent, Util.RC_INTENT_GOOGLE_SIGNIN);
    presenter.trackingLoginButtonClick(getActivity(), io.caly.calyandroid.util.Util.getCurrentMethodName());
}