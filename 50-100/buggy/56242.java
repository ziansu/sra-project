private java.lang.String getFileName(javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> headers) {
    final java.lang.String[] parts = headers.getFirst("Content-Disposition").split(";");
    for (java.lang.String filename : parts) {
        if (filename.trim().startsWith("filename")) {
            java.lang.String name = filename.split("=")[1].trim();
            return name.replaceAll("^\"|\"$", "");
        }
    }
    return null;
}