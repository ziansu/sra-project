@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    mAuthProgressDialog.dismiss();
    if (task.isSuccessful()) {
        android.util.Log.d(co.vendoo.vendooepicodus.ui.CreateAccountActivity.TAG, "Authentication successful");
        android.util.Log.d(co.vendoo.vendooepicodus.ui.CreateAccountActivity.TAG, task.getResult().getUser().toString());
        createFirebaseUserProfile(task.getResult().getUser());
    }else {
        android.widget.Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
}