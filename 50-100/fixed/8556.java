@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    if ((firebaseAuth.getCurrentUser()) == null) {
        android.content.Intent loginIntent = new android.content.Intent(this, com.mobapde.vince.mobapde.LoginActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(loginIntent);
    }
}