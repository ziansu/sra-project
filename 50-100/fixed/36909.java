@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(",", ("signInWithCredentialonComplete" + (task.isSuccessful())));
    if (task.isSuccessful()) {
        android.util.Log.v(",", "signInWithCredential", task.getException());
    }
}