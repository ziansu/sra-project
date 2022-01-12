private org.loklak.server.ClientIdentity getAnonymousIdentity(javax.servlet.http.HttpServletRequest request) {
    org.loklak.server.ClientCredential credential = new org.loklak.server.ClientCredential(ClientCredential.Type.host, request.getRemoteHost());
    org.loklak.server.Authentication authentication = new org.loklak.server.Authentication(credential, org.loklak.data.DAO.authentication);
    authentication.setExpireTime(((java.time.Instant.now().getEpochSecond()) + (org.loklak.server.AbstractAPIHandler.defaultAnonymousTime)));
    return authentication.getIdentity();
}