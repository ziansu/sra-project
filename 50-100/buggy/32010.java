private void initFirebaseUser() {
    mFirebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    mFirebaseUser = mFirebaseAuth.getCurrentUser();
    if ((mFirebaseUser) == null) {
        startActivity(new android.content.Intent(this, com.example.jsung721.ronaldmcdonald_prototype1.SignInSignOutActivity.class));
        finish();
        return ;
    }
}