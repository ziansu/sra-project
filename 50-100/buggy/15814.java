@java.lang.Override
public java.util.Collection<java.io.InputStream> fetch() throws java.io.IOException {
    final java.util.Enumeration<java.net.URL> resources = java.lang.Thread.currentThread().getContextClassLoader().getResources("META-INF/MANIFEST.MF");
    final java.util.Collection<java.io.InputStream> streams = new java.util.ArrayList<java.io.InputStream>();
    while (resources.hasMoreElements()) {
        streams.add(resources.nextElement().openStream());
    } 
    return streams;
}