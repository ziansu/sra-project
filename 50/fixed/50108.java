private static void logResolveError(java.lang.Object uri, java.lang.Exception e) {
    java.lang.System.err.printf("Failed resolving data, uri: %s cause: %s", uri, e.getMessage());
}