@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d("TAG", ("signInAnonymously:onComplete:" + (task.isSuccessful())));
    goToNextActivity();
    if (!(task.isSuccessful())) {
        android.util.Log.w("TAG", "signInAnonymously", task.getException());
        registerAnonymousUser();
    }
}