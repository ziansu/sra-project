@io.swagger.annotations.ApiOperation(value = "Get Che server info")
@org.springframework.web.bind.annotation.GetMapping(value = "/server/oso")
public io.fabric8.che.starter.model.server.CheServerInfo getCheServerInfoOnOpenShift(@org.springframework.web.bind.annotation.RequestParam
java.lang.String masterUrl, @org.springframework.web.bind.annotation.RequestParam
java.lang.String namespace, @io.swagger.annotations.ApiParam(value = "OpenShift token", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String openShiftToken, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    io.fabric8.openshift.client.OpenShiftClient openShiftClient = openShiftClientWrapper.get(masterUrl, openShiftToken);
    java.lang.String requestURL = request.getRequestURL().toString();
    return cheServerClient.getCheServerInfo(openShiftClient, namespace, requestURL);
}