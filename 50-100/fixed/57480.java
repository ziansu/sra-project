private void toggleNavSignInText() {
    if (((signedInTwitter) || (signedInGoogle)) || (signedInFacebook)) {
        signInButton.setVisibility(View.GONE);
        setFABUI(true);
        if ((signOutOption) != null)
            signOutOption.setVisible(true);
        
    }else {
        signInButton.setVisibility(View.VISIBLE);
        setFABUI(false);
        if ((signOutOption) != null)
            signOutOption.setVisible(false);
        
    }
}