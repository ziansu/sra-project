@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    mAuthProgressDialog.dismiss();
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, ("Authentication failed." + (task.getException())), Toast.LENGTH_SHORT).show();
    }else {
        android.util.Log.d(com.gatech.edu.soloTechno.m4_login.RegisterActivity.TAG, "Authentication successful");
        createFirebaseUserProfile(task.getResult().getUser());
    }
}