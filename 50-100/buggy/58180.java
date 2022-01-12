@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        android.util.Log.d("EXCEPTION", task.toString());
        throw new java.lang.IllegalArgumentException();
    }
    java.lang.String key = task.getResult().getUser().getUid();
    groupproject.cmsc436.flow.UserInfo user = new groupproject.cmsc436.flow.UserInfo(key, email, first, last);
    userReference.child(key).setValue(user);
}