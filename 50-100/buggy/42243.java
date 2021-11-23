@java.lang.Override
public void setClassPathUrls(java.util.List<java.net.URL> classPathUrls) {
    java.net.URL[] cp = classPathUrls.toArray(new java.net.URL[classPathUrls.size()]);
    java.lang.ClassLoader classLoader = java.lang.ClassLoader.getSystemClassLoader();
    io.ebean.enhance.Transformer transformer = new io.ebean.enhance.Transformer(new java.net.URLClassLoader(cp, null), "debug=-1");
    inputStreamTransform = new io.ebean.enhance.common.InputStreamTransform(transformer, classLoader);
}