public java.net.URI buildAuthenticationRequestInURI(java.lang.String resourceURI) throws java.lang.Exception {
    com.nimbusds.oauth2.sdk.id.State state = new com.nimbusds.oauth2.sdk.id.State(resourceURI);
    com.nimbusds.openid.connect.sdk.AuthenticationRequest req = new com.nimbusds.openid.connect.sdk.AuthenticationRequest(null, new com.emc.storageos.auth.idp.ResponseType(ResponseType.Value.CODE), com.emc.storageos.auth.idp.Scope.parse("openid email profile address"), new com.nimbusds.oauth2.sdk.id.ClientID(getOidcAuthProvider().getOidcClientId()), java.net.URI.create(getOidcAuthProvider().getOidcCallBackUrl()), state, null);
    return buildAuthLocation(req);
}