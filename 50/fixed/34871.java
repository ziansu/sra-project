public static java.util.jar.Attributes readManifest(java.io.File jarFile) throws java.io.IOException {
    try (java.util.jar.JarInputStream jar = new java.util.jar.JarInputStream(new java.io.FileInputStream(jarFile))) {
        return jar.getManifest().getMainAttributes();
    }
}