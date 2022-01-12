@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        if ((mAuthResultListener) != null) {
            mAuthResultListener.onComplete(true);
        }
    }else {
        if ((mAuthResultListener) != null) {
            mAuthResultListener.onComplete(false);
        }
    }
}