@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d("LOGIN", ("signInWithEmail:onComplete:" + (task.isSuccessful())));
    if (!(task.isSuccessful())) {
        android.util.Log.w("LOGIN", "signInWithEmail", task.getException());
        android.widget.Toast.makeText(this, "Error de Login, compruebe sus credenciales", Toast.LENGTH_LONG).show();
    }else {
        startActivity(intentLog);
    }
}