public burp.AntiCSRFTokenStatus AddToken(java.lang.String tokenValue, java.lang.String sessionID) {
    for (burp.AntiCSRFToken antiCSRFToken : tokens) {
        if (sessionID.equals(antiCSRFToken.sessionID)) {
            antiCSRFToken.tokenValue = tokenValue;
            antiCSRFToken.ReleaseToken();
            return AntiCSRFTokenStatus.TOKEN_UPDATED;
        }
    }
    burp.AntiCSRFToken newToken = new burp.AntiCSRFToken(tokenValue, sessionID);
    this.tokens.add(newToken);
    return AntiCSRFTokenStatus.TOKEN_ADDED;
}