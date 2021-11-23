private static void printClasspath(java.lang.ClassLoader cl) {
    java.net.URL[] urls = ((java.net.URLClassLoader) (cl)).getURLs();
    for (java.net.URL url : urls) {
        us.dot.its.jpo.ode.plugin.PluginFactory.logger.info("Classpath: {}", url.getFile());
    }
}