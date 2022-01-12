@java.lang.Override
protected java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    for (org.bimserver.plugins.classloaders.PublicFindClassClassLoader jarClassLoader : jarClassLoaders) {
        try {
            java.lang.Class<?> findClass = jarClassLoader.findClass(name);
            if (findClass != null) {
                return findClass;
            }
        } catch (java.lang.ClassNotFoundException e) {
        }
    }
    throw new java.lang.ClassNotFoundException(name);
}