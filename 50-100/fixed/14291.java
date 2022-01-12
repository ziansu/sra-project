private void appendProperty(java.lang.String propertyName, java.lang.String propertyValue, java.lang.StringBuilder builder) {
    if ((propertyValue != null) && (!(propertyValue.isEmpty()))) {
        if ((builder.length()) > 0) {
            builder.append("&");
        }
        builder.append(propertyName).append("=").append(propertyValue);
    }
}