public java.lang.String GetToken(java.lang.String sessionID) {
    for (burp.AntiCSRFToken antiCSRFToken : tokens) {
        if (antiCSRFToken.sessionID.equals(sessionID)) {
            try {
                antiCSRFToken.LockToken();
            } catch (java.lang.InterruptedException e) {
                antiCSRFToken.ReleaseToken();
                e.printStackTrace();
            }
            return antiCSRFToken.tokenValue;
        }
    }
    return null;
}