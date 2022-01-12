public static void appendToURI(java.lang.StringBuilder restOfURI, java.lang.String pathParam) {
    if (!(org.apache.commons.lang.StringUtils.endsWith(restOfURI.toString(), com.redhat.lightblue.client.request.AbstractLightblueRequest.PATH_SEPARATOR))) {
        restOfURI.append(com.redhat.lightblue.client.request.AbstractLightblueRequest.PATH_SEPARATOR);
    }
    restOfURI.append(pathParam);
}