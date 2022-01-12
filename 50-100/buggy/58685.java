@android.support.annotation.VisibleForTesting
boolean getNeedsTokenRefresh(net.openid.appauth.Clock clock) {
    if ((getRefreshToken()) == null) {
        return false;
    }
    if (mNeedsTokenRefreshOverride) {
        return true;
    }
    if ((getAccessTokenExpirationTime()) == null) {
        return (getAccessToken()) == null;
    }
    return (getAccessTokenExpirationTime()) <= ((clock.getCurrentTimeMillis()) + (net.openid.appauth.AuthState.EXPIRY_TIME_TOLERANCE_MS));
}