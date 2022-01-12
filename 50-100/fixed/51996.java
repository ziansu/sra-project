@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    currentUser = firebaseAuth.getCurrentUser();
    if ((currentUser) != null) {
        com.abhi.android.sciencebowl.LoginActivity.LoginTask t = new com.abhi.android.sciencebowl.LoginActivity.LoginTask();
        t.execute(true, false);
        android.util.Log.d(com.abhi.android.sciencebowl.LoginActivity.TAG, ("onAuthStateChanged:signed_in:" + (currentUser.getUid())));
    }else {
    }
}