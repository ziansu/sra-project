public static java.lang.ClassLoader createClassLoader(final java.net.URL[] urls, final java.lang.ClassLoader parentClassLoader) {
    java.lang.System.setSecurityManager(null);
    final java.net.URLClassLoader newClassLoader = java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.net.URLClassLoader>() {
        @java.lang.Override
        public java.net.URLClassLoader run() {
            return new java.net.URLClassLoader(urls, parentClassLoader);
        }
    });
    return newClassLoader;
}