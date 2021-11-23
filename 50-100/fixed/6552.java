@java.lang.SuppressWarnings(value = "PMD")
public void extractWarFile(java.lang.String jarFile) {
    refreshDirectory(jarFile);
    try (java.util.jar.JarFile jar = new java.util.jar.JarFile((((warDirectory) + (java.io.File.separator)) + jarFile))) {
        java.util.Enumeration entries = jar.entries();
        while (entries.hasMoreElements()) {
            extractFile(jar, entries);
        } 
    } catch (java.io.IOException e) {
        org.apache.commons.io.FileUtils.deleteQuietly(deployDirectory);
        nc.sumy.edu.webcontainer.deployment.ArchiveExtractor.LOG.warn("Cannot read/write/found file: ", e);
    }
}