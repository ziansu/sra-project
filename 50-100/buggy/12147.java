@java.lang.Override
public java.net.URL getResource(java.lang.String name) {
    ro.fortsoft.pf4j.IzouPluginClassLoader.log.debug("Trying to find resource '{}' in plugin classpath", name);
    java.net.URL url = classLoader.findResource(name);
    if (url == null)
        url = libClassLoader.findResource(name);
    
    if (url != null) {
        ro.fortsoft.pf4j.IzouPluginClassLoader.log.debug("Found resource '{}' in plugin classpath", name);
        return url;
    }
    ro.fortsoft.pf4j.IzouPluginClassLoader.log.debug("Couldn't find resource '{}' in plugin classpath. Delegating to parent");
    return super.getResource(name);
}