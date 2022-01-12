@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        regErrLbl.setText("Error Signing Up");
    }else {
        com.lintech.yougo.User user = new com.lintech.yougo.User(name, email, task.getResult().getUser().getUid());
        com.lintech.yougo.Trip trip = new com.lintech.yougo.Trip("0", "0", "0", "");
        newUser(user, trip);
    }
}