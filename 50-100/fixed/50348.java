private java.nio.file.Path initWorkingDirectory() {
    final java.lang.String configuredHome = super.getRepositoryHome();
    final java.nio.file.Path workingDir;
    if (configuredHome == null) {
        try {
            workingDir = java.nio.file.Files.createTempDirectory("inkstand");
        } catch (java.io.IOException e) {
            throw new io.inkstand.InkstandRuntimeException("Could not create temporary working directory", e);
        }
    }else {
        workingDir = java.nio.file.Paths.get(configuredHome);
    }
    return workingDir.toAbsolutePath();
}