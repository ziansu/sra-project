private void checkUserChanged() {
    if ((mEditUserAccount) != null) {
        java.lang.String username = mEditUserAccount.getText().toString().trim();
        if ((!(username.equals(mOriginalUserAccount))) && (parseAccount(username))) {
            settingsForDomain(mDomain, mPort);
            mOriginalUserAccount = username;
        }
    }
}