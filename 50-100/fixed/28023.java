@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.google.firebase.auth.FirebaseAuth auth = com.google.firebase.auth.FirebaseAuth.getInstance();
    android.content.Intent intent;
    if ((auth.getCurrentUser()) == null) {
        startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setProviders(getSelectedProviders()).build(), br.com.futusteps.survey.ui.splash.SplashActivity.RC_SIGN_IN);
    }else {
        intent = new android.content.Intent(this, br.com.futusteps.survey.MainActivity.class);
        startActivity(intent);
        finish();
    }
}