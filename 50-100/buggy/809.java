private boolean isEmptyBody(java.util.Map<java.lang.String, java.lang.String> transportHeadersMap) {
    boolean isEmptyBody = false;
    if (transportHeadersMap != null) {
        java.lang.String contentLength = transportHeadersMap.get(HTTPConstants.HEADER_CONTENT_LENGTH);
        if ((contentLength != null) && ((java.lang.Integer.parseInt(contentLength)) == 0)) {
            isEmptyBody = true;
        }
    }
    return isEmptyBody;
}