public java.lang.String[] importArchive(java.io.File file) throws java.lang.Exception {
    java.io.FileInputStream in = null;
    try {
        in = new java.io.FileInputStream(file);
        return importArchive(in);
    } catch (java.lang.Exception e) {
        throw e;
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(in);
    }
}