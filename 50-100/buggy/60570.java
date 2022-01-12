@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    progressBar.setVisibility(View.GONE);
    if (!(task.isSuccessful())) {
        if ((password.length()) < 6) {
            inputPassword.setError(getString(R.string.minimum_password));
        }else {
            android.widget.Toast.makeText(this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
        }
    }else {
        checkIfEmailVerified();
    }
}