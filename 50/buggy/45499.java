@io.swagger.annotations.ApiOperation(value = "Start Che Server")
@org.springframework.web.bind.annotation.PatchMapping(value = "/server/oso")
public io.fabric8.che.starter.model.server.CheServerInfo startCheServerOnOpenShift(@org.springframework.web.bind.annotation.RequestParam
java.lang.String masterUrl, @org.springframework.web.bind.annotation.RequestParam
java.lang.String namespace, @io.swagger.annotations.ApiParam(value = "OpenShift token", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String openShiftToken, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    io.fabric8.che.starter.model.server.CheServerInfo info = startServer(masterUrl, openShiftToken, namespace, response, request);
    return info;
}