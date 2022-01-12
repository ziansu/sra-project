@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.widget.Toast.makeText(this, "Settings saved!!", Toast.LENGTH_LONG).show();
    startActivity(new android.content.Intent(this, io.rasprovers.remotus.activities.MainActivity.class));
    finish();
    progressdialog.hide();
    progressdialog.dismiss();
}