@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d("Authentication", ("signInWithCredential:onComplete:" + (task.isSuccessful())));
    if (!(task.isSuccessful())) {
        android.util.Log.w("Authentication", "signInWithCredential", task.getException());
        android.widget.Toast.makeText(self, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }else {
        authenticationDone();
    }
}