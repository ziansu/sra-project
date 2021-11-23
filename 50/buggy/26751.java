@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user == null) {
        startActivity(new android.content.Intent(this, bt.com.bombardiertransportation.LoginActivity.class));
        finish();
    }
    displaySelectedScreen(R.id.nav_QRDevice);
}