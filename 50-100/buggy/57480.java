private void toggleNavSignInText() {
    if (((signedInTwitter) || (signedInGoogle)) || (signedInFacebook)) {
        signInButton.setVisibility(View.GONE);
        if (initialized)
            setFABUI(true);
        
        if ((signOutOption) != null)
            signOutOption.setVisible(true);
        
    }else {
        signInButton.setVisibility(View.VISIBLE);
        if (initialized)
            setFABUI(false);
        
        if ((signOutOption) != null)
            signOutOption.setVisible(false);
        
    }
}