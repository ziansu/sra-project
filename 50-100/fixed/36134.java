public static java.lang.String delete(java.lang.String ak, java.lang.String sk, java.lang.String requestUrl, java.lang.String serviceName, java.lang.String region) {
    java.lang.String stringResponse = "";
    java.util.Map<java.lang.String, java.lang.Object> responseMap = com.hws.gateway.access.RestMethod.delete(ak, sk, requestUrl, serviceName, region);
    stringResponse = com.hws.gateway.common.GWUtil.mapToString(responseMap);
    com.hws.gateway.ServiceAplicationProxy.logger.debug(("Response of rest method DELETE is: " + stringResponse));
    return stringResponse;
}