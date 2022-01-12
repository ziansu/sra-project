private java.lang.Boolean checkClassLoader(java.lang.String className) {
    try {
        java.lang.ClassLoader loader = org.eclipse.persistence.platform.server.was.WebSpherePlatformDetector.class.getClassLoader();
        java.lang.Class<?> cls = loader.loadClass(className);
        if (cls != null) {
            return java.lang.Boolean.TRUE;
        }
    } catch (java.lang.Throwable t) {
    }
    return java.lang.Boolean.FALSE;
}