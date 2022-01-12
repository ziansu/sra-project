protected java.net.URL getURL(com.beimin.eveapi.parser.ApiRequest request) throws com.beimin.eveapi.exception.ApiException {
    try {
        java.lang.StringBuilder result = new java.lang.StringBuilder(getBaseUrl());
        result.append(request.getPath().getPath());
        result.append("/").append(request.getPage().getPage());
        result.append(".xml.aspx");
        return new java.net.URL(result.toString());
    } catch (java.lang.Exception e) {
        throw new com.beimin.eveapi.exception.ApiException(e);
    }
}