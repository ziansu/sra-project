@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
        android.content.Intent intent = new android.content.Intent(this, com.example.guest.iamhere.activities.MainActivity.class);
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(intent);
        finish();
    }
}