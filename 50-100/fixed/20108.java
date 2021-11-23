private void revoke(co.cask.cdap.proto.security.RevokeRequest revokeRequest) throws co.cask.cdap.common.FeatureDisabledException, co.cask.cdap.common.NotFoundException, co.cask.cdap.common.UnauthenticatedException, co.cask.cdap.security.spi.authorization.UnauthorizedException, java.io.IOException {
    java.net.URL url = config.resolveURLV3(((co.cask.cdap.client.AuthorizationClient.AUTHORIZATION_BASE) + "/privileges/revoke"));
    co.cask.common.http.HttpRequest request = co.cask.common.http.HttpRequest.post(url).withBody(co.cask.cdap.client.AuthorizationClient.GSON.toJson(revokeRequest)).build();
    executePrivilegeRequest(request);
}