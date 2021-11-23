@java.lang.Override
protected void onDestroy() {
    mAuthContext.cancelAuthenticationActivity(0);
    super.onDestroy();
}