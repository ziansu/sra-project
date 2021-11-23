@java.lang.Override
public java.lang.String extractAuthCode(final java.lang.String url) throws java.io.IOException {
    com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl authResponse = new com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl(url.toString());
    if ((authResponse.getError()) == null) {
        uk.ac.cam.cl.dtg.segue.auth.FacebookAuthenticator.log.debug("User granted access to our app.");
    }else {
        uk.ac.cam.cl.dtg.segue.auth.FacebookAuthenticator.log.info("User denied access to our app.");
    }
    return authResponse.getCode();
}