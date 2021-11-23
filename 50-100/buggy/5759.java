public static long getApplicationLifeSpan(net.whydah.sso.application.types.Application app) {
    if ((app.getSecurity()) != null) {
        long maxUserSessionFromApplication = java.lang.Long.valueOf(app.getSecurity().getMaxSessionTimeoutSeconds());
        if (maxUserSessionFromApplication > 10) {
            if (maxUserSessionFromApplication < ((net.whydah.token.user.AuthenticatedUserTokenRepository.DEFAULT_SESSION_EXTENSION_TIME_IN_SECONDS) * 1000)) {
                net.whydah.token.application.SessionHelper.log.debug("Returning ApplicationToken MaxSessionTimeoutSeconds:{} for Application:{}", maxUserSessionFromApplication, app.getName());
                return maxUserSessionFromApplication;
            }
        }
    }
    net.whydah.token.application.SessionHelper.log.debug("Returning ApplicationToken defaultlifespan:{} for Application:{}", net.whydah.token.application.SessionHelper.defaultlifespan, app.getName());
    return net.whydah.token.application.SessionHelper.defaultlifespan;
}