@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.widget.Toast.makeText(this, "Account created successfully ", Toast.LENGTH_LONG);
        progressBar_signup.setVisibility(View.INVISIBLE);
    }
    if (!(task.isSuccessful())) {
        progressBar_signup.setVisibility(View.INVISIBLE);
        android.widget.Toast.makeText(this, "unable to create a account", Toast.LENGTH_SHORT);
        return ;
    }
}