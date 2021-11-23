public static void addFile(java.io.File f) throws java.io.IOException {
    org.roda.core.util.ClassLoaderUtility.addURL(f.toURI().toURL());
}