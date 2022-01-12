public boolean tryGetBoolean(org.apache.http.HttpResponse response, java.lang.String name, boolean defaultValue) {
    final org.apache.http.Header header = response.getFirstHeader(name);
    if (header != null) {
        final java.lang.String value = header.getValue();
        if (value != null) {
            if ("true".equalsIgnoreCase(value)) {
                return true;
            }else
                if ("false".equalsIgnoreCase(value)) {
                    return false;
                }
            
        }else {
            return defaultValue;
        }
    }
    return defaultValue;
}