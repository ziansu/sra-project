public void displayUsername() {
    final com.google.firebase.auth.FirebaseUser firebaseUser = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    assert firebaseUser != null;
    android.view.View header = navigationView.getHeaderView(0);
    android.widget.TextView mUsernameTextField = ((android.widget.TextView) (header.findViewById(R.id.user_name)));
    if (mUsernameTextField != null) {
        mUsernameTextField.setText(firebaseUser.getDisplayName());
    }
}