public static java.lang.ClassLoader createClassLoader(final java.net.URL[] urls, final java.lang.ClassLoader parentClassLoader) {
    java.lang.System.setSecurityManager(null);
    return java.security.AccessController.doPrivileged(((java.security.PrivilegedAction<java.net.URLClassLoader>) (() -> new java.net.URLClassLoader(urls, parentClassLoader))));
}