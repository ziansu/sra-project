@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    progressBar.setVisibility(View.GONE);
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, ("Authentication failed: " + (task.getException())), Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Successfully registered.", Toast.LENGTH_SHORT).show();
        finish();
    }
}