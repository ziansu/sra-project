static java.lang.String loadSQLFile(java.lang.String name) {
    final java.lang.String path = "tech/aroma/sql";
    final java.lang.String fullPath = (path + "/") + name;
    java.net.URL url = com.google.common.io.Resources.getResource(fullPath);
    try {
        return com.google.common.io.Resources.toString(url, com.google.common.base.Charsets.UTF_8);
    } catch (java.io.IOException ex) {
        tech.aroma.data.sql.SQLStatements.LOG.error("Failed to load file: {}", name, ex);
        throw new java.lang.RuntimeException(("Failed to load file: " + name), ex);
    }
}