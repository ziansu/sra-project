@java.lang.Override
public java.lang.Class<?> loadClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    for (java.lang.ClassLoader bundleClassLoader : bundleClassLoaders) {
        try {
            return bundleClassLoader.loadClass(name);
        } catch (java.lang.ClassNotFoundException ex) {
        }
    }
    throw new java.lang.ClassNotFoundException(name);
}