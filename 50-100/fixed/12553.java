@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.util.Log.d(com.example.jason.fooder1.LoginPage.TAG, "signInWithCredential:success");
        com.google.firebase.auth.FirebaseUser user = mAuth.getCurrentUser();
    }else {
        android.util.Log.w(com.example.jason.fooder1.LoginPage.TAG, "signInWithCredential:failure", task.getException());
        android.widget.Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
}