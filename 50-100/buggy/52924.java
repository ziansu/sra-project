@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful()))
        android.widget.Toast.makeText(getApplicationContext(), getString(R.string.registration_no), Toast.LENGTH_SHORT).show();
    else {
        android.widget.Toast.makeText(getApplicationContext(), getString(R.string.registration_ok), Toast.LENGTH_SHORT).show();
        finish();
    }
}