@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        progressDialog.dismiss();
        Auth.GoogleSignInApi.signOut(mGoogleApiClient);
        android.widget.Toast.makeText(this, "Log in Successful", Toast.LENGTH_SHORT).show();
    }else {
        progressDialog.hide();
        android.widget.Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
    }
}