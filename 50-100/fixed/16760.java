private void setupSignInButtons(android.view.View view) {
    signOutButton = ((android.widget.Button) (view.findViewById(R.id.button_signout)));
    signOutButton.setOnClickListener(this);
    signInButton = ((android.widget.Button) (view.findViewById(R.id.button_signin)));
    signInButton.setOnClickListener(this);
    final boolean isUserSignedIn = identityManager.isUserSignedIn();
    signOutButton.setVisibility((isUserSignedIn ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    signInButton.setVisibility((!isUserSignedIn ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
}