public static void zipDirectory(java.io.File dir, java.io.File zipFile) throws java.io.IOException {
    java.io.FileOutputStream fout = new java.io.FileOutputStream(zipFile);
    java.util.zip.ZipOutputStream zout = new java.util.zip.ZipOutputStream(fout);
    org.jboss.tools.tycho.sitegenerator.FetchSourcesFromManifests.zipSubDirectory("", dir, zout);
    zout.flush();
    zout.close();
}