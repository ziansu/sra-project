public synchronized com.sun.mail.imap.IMAPStore getIMAPStore(java.lang.String user, java.lang.String oauthToken) {
    try {
        initialize();
        return com.einzig.ipst2.oauth.OAuth2Authenticator.connectToImap("imap.gmail.com", 993, user, oauthToken, true);
    } catch (java.lang.Exception e) {
        android.util.Log.d(MainActivity.TAG, e.toString());
    }
    return null;
}