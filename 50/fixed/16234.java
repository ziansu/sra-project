private static java.lang.String normalizeBasePath(java.lang.String basePath) {
    java.lang.String normalized = basePath;
    while (normalized.endsWith("/")) {
        normalized = normalized.substring(0, ((normalized.length()) - 1));
    } 
    return normalized;
}