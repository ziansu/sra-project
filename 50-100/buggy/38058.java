public static java.util.Set<java.net.URL> resolvePropertiesFiles(java.lang.String name) throws java.io.IOException {
    java.util.Objects.requireNonNull(name);
    if (!(name.endsWith(".properties"))) {
        name = name + ".properties";
    }
    java.util.Set<java.net.URL> urls = new java.util.HashSet<>();
    java.util.Enumeration<java.net.URL> files = java.lang.Thread.currentThread().getContextClassLoader().getResources(name);
    while (files.hasMoreElements()) {
        urls.add(files.nextElement());
    } 
    return urls;
}