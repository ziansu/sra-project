private void refreshToken(me.id.webverifylib.listener.IDmeScope scope, java.lang.String refreshToken) {
    me.id.webverifylib.listener.IDmeAccessTokenManagerListener listener = getScopeListener(scope);
    new me.id.webverifylib.networking.GetAccessTokenConnectionTask(me.id.webverifylib.IDmeWebVerify.getAccessTokenFromRefreshTokenQuery(refreshToken), listener, scope).execute(me.id.webverifylib.IDmeWebVerify.getIdMeWebVerifyGetAccessTokenURI());
}