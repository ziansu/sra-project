private void signInGoogle() {
    signInIntent = Auth.GoogleSignInApi.getSignInIntent(SIM.getmGoogleApiClient());
    startActivityForResult(signInIntent, nl.rug.www.summerschool.controller.myprofile.SignInFragment.GOOGLE_SIGN_IN);
    signInIntent = null;
}