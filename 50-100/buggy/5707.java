public boolean checkPattern(java.util.List<com.android.internal.widget.LockPatternView.Cell> pattern, int userId) throws com.android.internal.widget.LockPatternUtils.RequestThrottledException {
    try {
        com.android.internal.widget.VerifyCredentialResponse response = getLockSettings().checkPattern(patternToString(pattern), userId);
        if ((response.getResponseCode()) == (VerifyCredentialResponse.RESPONSE_OK)) {
            return true;
        }else
            if ((response.getResponseCode()) == (VerifyCredentialResponse.RESPONSE_RETRY)) {
                throw new com.android.internal.widget.LockPatternUtils.RequestThrottledException(response.getTimeout());
            }else {
                return false;
            }
        
    } catch (android.os.RemoteException re) {
        return true;
    }
}