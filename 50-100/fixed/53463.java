@io.swagger.annotations.ApiOperation(value = "Get Che server info")
@org.springframework.web.bind.annotation.GetMapping(value = "/server")
public io.fabric8.che.starter.model.server.CheServerInfo getCheServerInfo(@org.springframework.web.bind.annotation.RequestParam
java.lang.String masterUrl, @org.springframework.web.bind.annotation.RequestParam
java.lang.String namespace, @io.swagger.annotations.ApiParam(value = "Keycloak token", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String keycloakToken, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    io.fabric8.che.starter.client.keycloak.KeycloakTokenValidator.validate(keycloakToken);
    java.lang.String openShiftToken = keycloakClient.getOpenShiftToken(keycloakToken);
    io.fabric8.openshift.client.OpenShiftClient openShiftClient = openShiftClientWrapper.get(masterUrl, openShiftToken);
    java.lang.String requestURL = request.getRequestURL().toString();
    return cheServerClient.getCheServerInfo(openShiftClient, namespace, requestURL, keycloakToken);
}