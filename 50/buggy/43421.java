@java.lang.Override
public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    ru.avb.iremember.G.Log("On result");
    ru.avb.iremember.Google.handleSignInResult(this, googleSignInResult);
    ru.avb.iremember.DB.setDbName();
}