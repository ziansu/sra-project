@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.util.Log.d(com.project.onur.playerx.activity.LoginActivity.TAG, "signInWithCredential:success");
        mUser = mAuth.getCurrentUser();
        getUserFromFirebase(mUser);
    }else {
        progressDialog.dismiss();
        android.util.Log.w(com.project.onur.playerx.activity.LoginActivity.TAG, "signInWithCredential:failure", task.getException());
        android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(view, getString(R.string.something_went_wrong), Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}