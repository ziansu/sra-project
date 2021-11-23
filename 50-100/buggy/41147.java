public void changePassword(java.lang.String loginEmail, java.lang.String oldPassword, java.lang.String newPassword, final com.ohiostate.chuckmyphone.chuckmyphone.ChangePasswordFragment changePasswordFragment) {
    this.changePasswordFragment = changePasswordFragment;
    com.google.firebase.auth.FirebaseUser user = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    user.updatePassword(newPassword).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.Void>() {
        @java.lang.Override
        public void onComplete(@android.support.annotation.NonNull
        com.google.android.gms.tasks.Task<java.lang.Void> task) {
            if (task.isSuccessful()) {
                changePasswordFragment.onSuccessfulPasswordChange();
            }else {
                changePasswordFragment.onUnsuccessfulPasswordChange(task.getException());
            }
        }
    });
}