@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        android.util.Log.d("AUTH", ("Signed in... UserID: + " + (user.getUid())));
        android.content.Intent intent = new android.content.Intent(this, com.dhbw.project.spezl.view.DecisionActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }else {
        android.util.Log.d("AUTH", "Signed out...");
    }
}