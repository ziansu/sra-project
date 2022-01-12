@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    this.mTaskInProgress = false;
    android.util.Log.d(getClass().getCanonicalName(), ("signInWithEmail:onComplete:" + (task.isSuccessful())));
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, R.string.auth_failed, Toast.LENGTH_SHORT).show();
        this.showProgress(false);
    }else {
        gotoMainActivity();
    }
}