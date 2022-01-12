public void login() {
    mLoginFormView.setVisibility(View.GONE);
    mSpinner.setVisibility(View.VISIBLE);
    org.openmrs.mobile.bundle.AuthorizationManagerBundle bundle = org.openmrs.mobile.net.helpers.AuthorizationHelper.createBundle(mUsername.getText().toString(), mPassword.getText().toString(), mUrlTextView.getText().toString().trim());
    mAuthorizationManager.login(org.openmrs.mobile.net.helpers.AuthorizationHelper.createLoginListener(bundle, this), this);
}