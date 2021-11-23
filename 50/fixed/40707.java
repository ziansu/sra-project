public java.lang.String getHeaderValue(java.lang.String headerKey) {
    java.util.Map<java.lang.String, java.lang.String> resHeaders = this.accessor.getResHeaders();
    return resHeaders.get(headerKey);
}