public static void cleanApplicationTokenMap() {
    for (java.util.Map.Entry<java.lang.String, net.whydah.sso.application.types.ApplicationToken> entry : net.whydah.token.application.AuthenticatedApplicationTokenRepository.applicationTokenMap.entrySet()) {
        net.whydah.sso.application.types.ApplicationToken applicationToken = entry.getValue();
        if (net.whydah.token.application.AuthenticatedApplicationTokenRepository.isApplicationTokenExpired(applicationToken.getApplicationTokenId())) {
            net.whydah.token.application.AuthenticatedApplicationTokenRepository.applicationTokenMap.remove(applicationToken);
        }
    }
}