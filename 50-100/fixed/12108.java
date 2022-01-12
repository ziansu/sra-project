@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(com.glocoders.hangout.database.FirebaseHelper.TAG, ("signInWithEmail:onComplete:" + (task.isSuccessful())));
    if ((task.isSuccessful()) == false) {
        android.util.Log.w(com.glocoders.hangout.database.FirebaseHelper.TAG, "signInWithEmail:failed", task.getException());
        code = -1;
    }else {
        code = 1;
    }
}