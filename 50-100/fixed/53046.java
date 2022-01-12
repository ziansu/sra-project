private int isHttpValid(com.telefonica.iot.cygnus.containers.CygnusSubscriptionV2.SubscriptionHttp http) {
    java.lang.String url = http.getUrl();
    if (url == null) {
        com.telefonica.iot.cygnus.containers.CygnusSubscriptionV2.LOGGER.debug("Field 'http' is missing");
        return 1;
    }else {
        if ((url.length()) == 0) {
            com.telefonica.iot.cygnus.containers.CygnusSubscriptionV2.LOGGER.debug("Field 'http' is empty");
            return 2;
        }
    }
    com.telefonica.iot.cygnus.containers.CygnusSubscriptionV2.LOGGER.debug("Valid http");
    return 0;
}