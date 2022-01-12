@java.lang.Override
public void grant(co.cask.cdap.proto.id.EntityId entity, co.cask.cdap.proto.security.Principal principal, java.util.Set<co.cask.cdap.proto.security.Action> actions) throws co.cask.cdap.common.FeatureDisabledException, co.cask.cdap.common.NotFoundException, co.cask.cdap.common.UnauthenticatedException, co.cask.cdap.security.spi.authorization.UnauthorizedException, java.io.IOException {
    co.cask.cdap.proto.security.GrantRequest grantRequest = new co.cask.cdap.proto.security.GrantRequest(entity, principal, actions);
    java.net.URL url = config.resolveURLV3(((co.cask.cdap.client.AuthorizationClient.AUTHORIZATION_BASE) + "/privileges/grant"));
    co.cask.common.http.HttpRequest request = co.cask.common.http.HttpRequest.post(url).withBody(co.cask.cdap.client.AuthorizationClient.GSON.toJson(grantRequest)).build();
    executePrivilegeRequest(entity, principal, request);
}