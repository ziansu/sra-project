protected static java.io.File getRealJarFile(java.io.File jarFilePath) {
    java.io.File[] files = jarFilePath.listFiles((java.io.File dir,java.lang.String name) -> (name.toLowerCase().startsWith("org.apache.karaf.main-")) && (name.toLowerCase().endsWith(".jar")));
    if ((files != null) && ((files.length) > 0)) {
        return files[0];
    }
    return jarFilePath;
}