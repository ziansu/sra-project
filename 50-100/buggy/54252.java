private void saveCamelMetaData(com.fasterxml.jackson.databind.node.ArrayNode root) throws java.io.IOException, org.apache.maven.plugin.MojoExecutionException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.io.File targetFile = new java.io.File(target);
    if (!(targetFile.getParentFile().exists())) {
        if (!(targetFile.getParentFile().mkdirs())) {
            throw new org.apache.maven.plugin.MojoExecutionException(("Cannot create directory " + (targetFile.getParentFile())));
        }
    }
    mapper.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(target), root);
}