private void onAuthSuccess(com.google.firebase.auth.FirebaseUser user) {
    java.lang.String username = usernameFromEmail(user.getEmail());
    com.task.vasskob.firebase.model.User newUser = new com.task.vasskob.firebase.model.User(username, user.getEmail());
    com.task.vasskob.firebase.database.FirebaseOperations.CreateNewUser(Constants.USERS, newUser);
    startActivity(new android.content.Intent(this, com.task.vasskob.firebase.ui.MainActivity.class));
    finish();
}