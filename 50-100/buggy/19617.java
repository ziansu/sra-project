@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null)
        android.util.Log.d("NewState", ("onAuthStateChanged: signed_In" + (user.getDisplayName())));
    else
        android.util.Log.d("NewState", "onAuthStateChanged: signed_Out");
    
}