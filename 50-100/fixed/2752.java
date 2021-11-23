private void update() {
    gso = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
    exarabete.audioapp.AccountHandler.googleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(activity).enableAutoManage(activity, this).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
    exarabete.audioapp.AccountHandler.googleApiClient.connect();
}