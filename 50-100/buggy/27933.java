private java.lang.String getFileName(javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> headers) {
    java.lang.String[] contentDisposition = headers.getFirst("Content-Disposition").split(";");
    for (java.lang.String filename : contentDisposition) {
        if (filename.trim().startsWith("filename")) {
            java.lang.String[] name = filename.split("=");
            java.lang.String finalFileName = sanitizeFilename(name[1]);
            return finalFileName;
        }
    }
    return "unknown";
}