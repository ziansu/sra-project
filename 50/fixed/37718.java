private java.lang.String generateURL(org.apache.http.HttpRequest httpRequest) {
    return httpRequest.getRequestLine().getUri();
}