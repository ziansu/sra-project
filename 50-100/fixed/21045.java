private static java.lang.String getCamelVersionFromDependencies(java.util.List<org.apache.maven.model.Dependency> deps) {
    for (org.apache.maven.model.Dependency pomDep : deps) {
        if ((pomDep.getGroupId().equalsIgnoreCase(CamelCatalogUtils.CATALOG_KARAF_GROUPID)) && (pomDep.getArtifactId().startsWith("camel-"))) {
            return pomDep.getVersion();
        }
    }
    return null;
}