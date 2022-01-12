protected java.lang.String buildHealthCheckString(java.lang.String path, java.lang.String host) {
    if (((path == null) || (path.equals(""))) || (host == null)) {
        return "";
    }
    if ((path.startsWith("GET")) || (path.startsWith("POST"))) {
        return path;
    }
    return ((("GET " + path) + " HTTP/1.0\\r\\nHost: ") + host) + "\\r\\n\\r\\n";
}