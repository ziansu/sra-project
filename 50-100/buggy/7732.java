public static void cleanIndexDirectory(java.lang.String solrHome, java.lang.String coreName) throws java.io.IOException {
    java.io.File indexDir = java.nio.file.Paths.get(solrHome, coreName, "data", "index").toFile();
    try {
        if (indexDir.exists()) {
            org.apache.commons.io.FileUtils.cleanDirectory(indexDir);
        }
    } catch (java.io.IOException e) {
        uk.ac.shef.dcs.jate.app.BaseEmbeddedSolrTest.LOG.error("Failed to clean index directory! Please do it manually!");
        throw e;
    }
}