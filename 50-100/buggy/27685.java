protected void handleTar(java.lang.String name, java.io.InputStream in) throws java.lang.Exception {
    org.polymap.p4.imports.FileImporter.log.info(("    TAR: " + name));
    try (org.apache.commons.compress.archivers.tar.TarArchiveInputStream tar = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(in)) {
        org.apache.commons.compress.archivers.ArchiveEntry entry = null;
        while ((entry = tar.getNextEntry()) != null) {
            if (entry.isDirectory()) {
            }else {
                handle(entry.getName(), null, in);
            }
        } 
    }
}