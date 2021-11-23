private void appendProperty(java.lang.String propertyName, java.lang.String propertyValue, java.lang.StringBuilder builder) {
    if ((builder.length()) > 0) {
        builder.append("&");
    }
    builder.append(propertyName).append("=").append(propertyValue);
}