protected org.gradle.internal.filewatch.FileWatcherFactory createFileWatcherFactory() {
    if (javaVersion.isJava7Compatible()) {
        java.lang.Class clazz;
        try {
            clazz = classLoader.loadClass("org.gradle.internal.filewatch.jdk7.Jdk7FileWatcherFactory");
            return org.gradle.internal.Cast.uncheckedCast(org.gradle.internal.reflect.DirectInstantiator.instantiate(clazz, executor));
        } catch (java.lang.ClassNotFoundException e) {
            org.gradle.internal.filewatch.DefaultFileWatcherFactory.LOG.error("Could not load JDK7 class with a JDK7+ JVM, falling back to no-op implementation.", e);
        }
    }
    org.gradle.internal.filewatch.DefaultFileWatcherFactory.LOG.debug("Using no-op file watcher service.");
    return new org.gradle.internal.filewatch.DefaultFileWatcherFactory.NoOpFileWatcherFactory();
}