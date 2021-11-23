@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(Constants.FIREBASE, ("signInWithEmail:onComplete:" + (task.isSuccessful())));
    if (!(task.isSuccessful())) {
        android.util.Log.w(Constants.FIREBASE, "signInWithEmail:failed", task.getException());
        android.widget.Toast.makeText(this, R.string.auth_error, Toast.LENGTH_SHORT).show();
    }
}