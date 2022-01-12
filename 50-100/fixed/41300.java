public static java.util.jar.Manifest getManifest(java.lang.Class<?> clazz) {
    try {
        java.lang.String jarUrl = clazz.getProtectionDomain().getCodeSource().getLocation().getFile();
        try (java.util.jar.JarFile jar = new java.util.jar.JarFile(new java.io.File(jarUrl))) {
            return jar.getManifest();
        }
    } catch (java.io.IOException e) {
        return null;
    }
}