@java.lang.Override
public java.net.URL findResource(java.lang.String name) {
    for (org.bimserver.plugins.classloaders.PublicFindClassClassLoader jarClassLoader : jarClassLoaders) {
        java.net.URL resource = jarClassLoader.findResource(name);
        if (resource != null) {
            return resource;
        }
    }
    return null;
}