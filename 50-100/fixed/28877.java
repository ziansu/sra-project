@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.util.Log.d(com.kareem.mynursery.authentication.LoginActivity.TAG, "signInWithCredential:success");
        finish();
    }else {
        android.util.Log.w("", "signInWithCredential:failure", task.getException());
        if ((task.getException()) instanceof com.google.firebase.auth.FirebaseAuthInvalidCredentialsException) {
            mVerificationField.setError("Invalid code.");
        }
        com.kareem.mynursery.Utils.showToast(getString(R.string.undefined_error_message), this);
    }
}