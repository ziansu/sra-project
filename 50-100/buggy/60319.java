@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    android.widget.Toast.makeText(this, "RIGHT after the bug", Toast.LENGTH_SHORT).show();
    if (task.isSuccessful()) {
        finish();
    }else {
        android.widget.Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
    }
}