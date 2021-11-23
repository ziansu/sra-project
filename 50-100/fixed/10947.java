private void interpolateDockerfile(java.io.File dockerFile, io.fabric8.maven.docker.assembly.BuildDirs params, java.util.Properties properties, java.lang.String filter) throws java.io.IOException {
    java.io.File targetDockerfile = new java.io.File(params.getOutputDirectory(), dockerFile.getName());
    java.lang.String dockerFileInterpolated = io.fabric8.maven.docker.assembly.DockerFileUtil.interpolate(dockerFile, properties, filter);
    try (java.io.Writer writer = new java.io.FileWriter(targetDockerfile)) {
        org.apache.commons.io.IOUtils.write(dockerFileInterpolated, writer);
    }
}