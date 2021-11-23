@java.lang.Override
public boolean isAllUrlAccessAllowed(org.archive.cdxserver.auth.AuthToken auth) {
    if ((auth.cachedAllUrlAllow) == null) {
        auth.cachedAllUrlAllow = isAllowed(auth, allUrlAccessTokens);
    }
    return auth.cachedAllUrlAllow;
}