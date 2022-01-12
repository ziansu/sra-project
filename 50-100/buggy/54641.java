@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(org.christmann.medievalbackend.LoginScreen.TAG, ("signInWithEmail:onComplete:" + (task.isSuccessful())));
    if (!(task.isSuccessful())) {
        android.util.Log.w(org.christmann.medievalbackend.LoginScreen.TAG, "signInWithEmail", task.getException());
        android.widget.Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
    android.util.Log.v(org.christmann.medievalbackend.LoginScreen.TAG, "Logged in successfully! Calling gotoToolsActivity()");
    gotoToolsActivity();
}