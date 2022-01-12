public static java.util.Enumeration<java.net.URL> resolvePropertiesFiles(java.lang.String name) throws java.io.IOException {
    java.util.Objects.requireNonNull(name);
    if (!(name.endsWith(".properties"))) {
        name = name + ".properties";
    }
    return java.lang.Thread.currentThread().getContextClassLoader().getResources(name);
}