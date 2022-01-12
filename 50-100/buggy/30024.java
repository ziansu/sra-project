public void lookupZipFile(java.io.File zipFile, java.lang.String entryName, boolean recursive) {
    jetbrick.io.finder.Validate.notNull(zipFile);
    if (entryName != null) {
        entryName = jetbrick.io.finder.StringUtils.removeEnd(entryName, "/");
    }
    entryName = jetbrick.io.finder.StringUtils.trimToEmpty(null);
    java.util.zip.ZipFile zip = null;
    try {
        zip = new java.util.zip.ZipFile(zipFile);
        doLookupInZipFile(zip, entryName, recursive);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        jetbrick.io.IoUtils.closeQuietly(zip);
    }
}