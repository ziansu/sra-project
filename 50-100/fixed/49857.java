private void addAuthorizationHeader(final com.ning.http.client.Realm realm, final org.glassfish.grizzly.http.HttpRequestPacket requestPacket) {
    if ((realm != null) && (realm.getUsePreemptiveAuth())) {
        final java.lang.String authHeaderValue = generateAuthHeader(realm);
        if (authHeaderValue != null) {
            requestPacket.addHeader(Header.Authorization, authHeaderValue);
        }
    }
}