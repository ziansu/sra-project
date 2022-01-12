@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.widget.Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
    android.content.Intent nextActivity = new android.content.Intent(this, com.jonathonfvega.chowki.Main2Activity.class);
    this.startActivity(nextActivity);
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, "Failure", Toast.LENGTH_LONG).show();
    }
}