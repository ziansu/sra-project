private void findSpecFilesInJar(java.io.File specJar) throws java.lang.Exception {
    try (java.util.jar.JarFile jar = new java.util.jar.JarFile(specJar)) {
        for (java.util.Enumeration<java.util.jar.JarEntry> e = jar.entries(); e.hasMoreElements(); e.nextElement()) {
            java.util.jar.JarEntry entry = e.nextElement();
            if (entry.getName().toLowerCase().endsWith("spec.class")) {
                specFiles.add(convertJarEntryToClassName(entry));
            }
        }
    }
}