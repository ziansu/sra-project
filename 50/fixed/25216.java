public java.lang.String getUrlDecodedHeader(java.lang.String name, java.lang.String message) {
    java.lang.String value = getUrlDecodedHeader(name);
    if (value == null) {
        throw new com.strategicgains.restexpress.exception.BadRequestException(message);
    }
    return value;
}