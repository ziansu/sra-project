@fr.thumbnailsdb.AfterClass
public void deleteDir() throws java.io.IOException {
    lshManagerIF = null;
    dbManagerIF = null;
    mediaIndexer = null;
    mediaFileDescriptorBuilder = null;
    org.apache.commons.io.FileUtils.deleteDirectory(tmpDir);
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("lsh"));
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("lsh.p"));
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("lsh.t"));
    } catch (java.lang.Exception e) {
    }
}