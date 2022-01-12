protected org.sonar.api.resources.Resource<?> createResource(java.io.File file, java.util.List<java.io.File> sourceDirs) {
    java.io.File resource = java.io.org.sonar.api.resources.File.fromIOFile(file, sourceDirs);
    if (resource != null) {
        java.lang.String projectDir = file.getParent();
        if (unitTestPaths.contains(projectDir)) {
            resource.setQualifier(Qualifiers.UNIT_TEST_FILE);
        }
        com.stevpet.sonar.plugins.dotnet.mscover.importer.cplusplus.CPlusPlusImporterSensor.LOG.debug("Created resource {}", resource.getKey());
    }
    return resource;
}