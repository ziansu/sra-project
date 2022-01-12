@java.lang.Override
public java.util.Enumeration<java.net.URL> getResources(java.lang.String name) throws java.io.IOException {
    java.util.List<java.net.URL> resourceUrls = new java.util.ArrayList<>();
    for (java.lang.ClassLoader bundleClassLoader : bundleClassLoaders) {
        resourceUrls.addAll(java.util.Collections.list(bundleClassLoader.getResources(name)));
    }
    return java.util.Collections.enumeration(resourceUrls);
}