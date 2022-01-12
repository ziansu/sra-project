private void addAuthorizationHeader(final com.ning.http.client.Request request, final org.glassfish.grizzly.http.HttpRequestPacket requestPacket) {
    com.ning.http.client.Realm realm = request.getRealm();
    if (realm == null) {
        realm = config.getRealm();
    }
    if ((realm != null) && (realm.getUsePreemptiveAuth())) {
        final java.lang.String authHeaderValue = generateAuthHeader(realm);
        if (authHeaderValue != null) {
            requestPacket.addHeader(Header.Authorization, authHeaderValue);
        }
    }
}