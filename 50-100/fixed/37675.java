@io.swagger.annotations.ApiOperation(value = "Start Che Server")
@org.springframework.web.bind.annotation.PatchMapping(value = "/server")
public io.fabric8.che.starter.model.server.CheServerInfo startCheServer(@org.springframework.web.bind.annotation.RequestParam
java.lang.String masterUrl, @org.springframework.web.bind.annotation.RequestParam
java.lang.String namespace, @io.swagger.annotations.ApiParam(value = "Keycloak token", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String keycloakToken, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    io.fabric8.che.starter.client.keycloak.KeycloakTokenValidator.validate(keycloakToken);
    java.lang.String openShiftToken = keycloakClient.getOpenShiftToken(keycloakToken);
    io.fabric8.che.starter.model.server.CheServerInfo info = startServer(masterUrl, openShiftToken, keycloakToken, namespace, response, request);
    return info;
}