public boolean checkPassword(java.lang.String password, int userId) throws com.android.internal.widget.LockPatternUtils.RequestThrottledException {
    try {
        com.android.internal.widget.VerifyCredentialResponse response = getLockSettings().checkPassword(password, userId);
        if ((response.getResponseCode()) == (VerifyCredentialResponse.RESPONSE_OK)) {
            return true;
        }else
            if ((response.getResponseCode()) == (VerifyCredentialResponse.RESPONSE_RETRY)) {
                throw new com.android.internal.widget.LockPatternUtils.RequestThrottledException(response.getTimeout());
            }else {
                return false;
            }
        
    } catch (android.os.RemoteException re) {
        return false;
    }
}