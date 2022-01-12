@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.widget.Toast.makeText(this, ("Authentication failed: " + (task.getException())), Toast.LENGTH_SHORT).show();
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.newproject.jordi.hackupc17.MainActivity.class);
        startActivity(intent);
    }
}