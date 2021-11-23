private boolean isEmptyBody(java.util.Map<java.lang.String, java.lang.Object> transportHeadersMap) {
    boolean isEmptyBody = false;
    if (transportHeadersMap != null) {
        java.lang.Object contentLength = transportHeadersMap.get(HTTPConstants.HEADER_CONTENT_LENGTH);
        if ((contentLength != null) && ((java.lang.Integer.parseInt(contentLength.toString())) == 0)) {
            isEmptyBody = true;
        }
    }
    return isEmptyBody;
}