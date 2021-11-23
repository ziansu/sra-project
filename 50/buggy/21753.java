public void addRequestHeader(java.lang.String headerName, java.lang.String header) {
    if ((requestHeaders) == null) {
        requestHeaders = new java.util.HashMap<java.lang.String, java.lang.String>();
    }
    requestHeaders.put(headerName, header);
}