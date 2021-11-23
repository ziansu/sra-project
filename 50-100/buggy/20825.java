public boolean hasPublishPermissions() {
    com.facebook.AccessToken fbToken = com.facebook.AccessToken.getCurrentAccessToken();
    if ((fbToken != null) && (!(fbToken.isExpired()))) {
        return fbToken.getPermissions().contains(com.codename1.social.FacebookImpl.PUBLISH_PERMISSIONS);
    }
    return false;
}