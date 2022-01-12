public java.lang.ClassLoader getClassLoaderByPluginName(java.lang.String name) {
    java.net.URL[] urls = jarUrls.get(name);
    java.lang.ClassLoader classLoader = this.getClass().getClassLoader();
    if ((urls == null) | ((urls.length) == 0)) {
        com.dtstack.jlogstash.classloader.JarClassLoader.logger.warn("{}:load by AppclassLoader", name);
        return classLoader;
    }
    return new java.net.URLClassLoader(urls, classLoader);
}