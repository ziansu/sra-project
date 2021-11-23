@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    com.seng480b.bumerang.utils.Utility.longToast(getApplicationContext(), getString(R.string.error_message));
    logoutFromFacebook(false);
}