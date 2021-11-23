@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(com.example.xie_xiao.myapplication.EmailPasswordActivity.TAG, ("createUserWithEmail:onComplete:" + (task.isSuccessful())));
    sendEmailVerification();
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, R.string.auth_failed, Toast.LENGTH_SHORT).show();
    }
    hideProgressDialog();
}