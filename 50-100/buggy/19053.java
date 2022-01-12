public static com.fasterxml.jackson.databind.JsonNode readMetadataFileInFolder(final java.lang.String baseDir) throws java.io.IOException {
    java.io.File[] files = new java.io.File(baseDir).listFiles();
    if ((files.length) == 0) {
        return null;
    }
    java.io.File stateFile = files[0];
    com.fasterxml.jackson.databind.JsonNode ret = repo.myjpa.elasticExport.util.MetadataFileUtil.readFile(stateFile.getPath());
    return ret;
}