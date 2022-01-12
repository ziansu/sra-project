private void handleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInResult result) {
    android.util.Log.d(com.ishaan.todolist.Login.TAG, ("handleSignInResult:" + (result.isSuccess())));
    if (result.isSuccess()) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount acct = result.getSignInAccount();
        android.util.Log.d(com.ishaan.todolist.Login.TAG, acct.getEmail());
        updateUI(true, acct.getEmail());
    }else {
        updateUI(false);
    }
}