@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        progressBar.cancel();
        com.firebasechatdemo.support.utils.SnackBarUtil.showSnackBar(getActivityRegister(), R.string.warning_registration_fail);
    }else {
        updateProfile();
    }
}