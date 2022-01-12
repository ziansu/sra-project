public void start(final java.lang.String email) {
    if ((crypto) != null)
        showLoggedIn();
    else
        displayWithClickBackToStart(CardConstants.loginCardType, CardConstants.contactingServerTitle, CardConstants.contactingServerText, email);
    
    loginStrategy.requestSessionSalt(new org.softwareFm.collections.mySoftwareFm.IRequestSaltCallback() {
        @java.lang.Override
        public void saltReceived(java.lang.String salt) {
            org.softwareFm.collections.explorer.internal.MySoftwareFm.this.signupSalt = salt;
            showLogin(salt, email);
        }

        @java.lang.Override
        public void problemGettingSalt(java.lang.String message) {
            displayWithClickBackToStart(CardConstants.loginCardType, CardConstants.failedToContactServerTitle, CardConstants.failedToContactServerText, email, message);
        }
    });
}