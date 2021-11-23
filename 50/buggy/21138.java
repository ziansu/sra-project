public static boolean isValidSession() {
    if ((((com.facebook.AccessToken.getCurrentAccessToken()) != null) && ((com.zap.models.Session.user) != null)) && ((com.zap.models.Session.mClient) != null)) {
        return true;
    }
    return false;
}