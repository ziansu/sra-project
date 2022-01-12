private static java.net.URL findClassPathUri(java.lang.Class<?> cls) {
    java.lang.ClassLoader loader = cls.getClassLoader();
    java.lang.String className = cls.getCanonicalName();
    className = (className.replace('.', '/')) + ".class";
    return loader.getResource(className);
}