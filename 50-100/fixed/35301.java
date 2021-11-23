@fr.thumbnailsdb.AfterClass
public void deleteDir() throws java.io.IOException {
    lshManagerIF = null;
    dbManagerIF = null;
    mediaIndexer = null;
    mediaFileDescriptorBuilder = null;
    tmpDir.delete();
    try {
        new java.io.File("lsh").delete();
        new java.io.File("lsh.p").delete();
        new java.io.File("lsh.t").delete();
    } catch (java.lang.Exception e) {
    }
}