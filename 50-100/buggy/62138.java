@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(movingforward.tutorapp3.Activities.ChatActivity.TAG, ("Create" + (task.isSuccessful())));
    if (task.isSuccessful()) {
    }
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, "Could not verify account on Firebase!", Toast.LENGTH_SHORT).show();
    }
}