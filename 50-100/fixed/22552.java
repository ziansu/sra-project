@javax.annotation.Nonnull
private scala.tools.nsc.Settings getSettings() {
    final scala.tools.nsc.Settings settings = new scala.tools.nsc.Settings();
    if (settings.classpath().isDefault()) {
        final java.lang.String classPath = ((com.google.common.base.Joiner.on(':').join(((java.net.URLClassLoader) (getClass().getClassLoader())).getURLs())) + ":") + (java.lang.System.getProperty("java.class.path"));
        settings.classpath().value_$eq(classPath);
    }
    return settings;
}