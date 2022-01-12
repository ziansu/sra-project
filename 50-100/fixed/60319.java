@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
        finish();
    }else {
        android.widget.Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
    }
}