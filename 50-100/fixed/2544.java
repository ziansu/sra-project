public static boolean authorize(android.content.Context context, android.accounts.Account account) {
    com.facebook.FacebookSdk.sdkInitialize(context);
    if ((org.codarama.haxsync.utilities.FacebookUtil.isExtendingToken) || (!(org.codarama.haxsync.utilities.DeviceUtil.isOnline(context)))) {
        return false;
    }
    com.facebook.AccessToken accessToken = com.facebook.AccessToken.getCurrentAccessToken();
    if ((accessToken == null) || (accessToken.isExpired())) {
        org.codarama.haxsync.utilities.FacebookUtil.notifyToken(context);
        return false;
    }
    return true;
}