@java.lang.Override
protected final java.lang.Class<?> loadClass(java.lang.String name, boolean resolve) throws java.lang.ClassNotFoundException {
    final java.lang.Class<?> c = super.loadClass(name, resolve);
    final java.lang.ClassLoader loader = ((c.getClassLoader()) == null) ? this : c.getClassLoader();
    de.skuzzle.tinyplugz.PluginClassLoader.LOG.debug("{} loaded by {}", name, loader);
    return c;
}