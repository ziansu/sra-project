@java.lang.Override
public void init() {
    if ((JavaVersion.VERSION.getPlatform()) != 8)
        throw new java.lang.IllegalStateException((((this) + " not applicable for java ") + (org.eclipse.jetty.util.JavaVersion.VERSION)));
    
    if ((org.eclipse.jetty.alpn.ALPN.class.getClassLoader()) != null)
        throw new java.lang.IllegalStateException(((this) + " must be on JVM boot classpath"));
    
    if (org.eclipse.jetty.alpn.openjdk8.server.OpenJDK8ServerALPNProcessor.LOG.isDebugEnabled())
        org.eclipse.jetty.alpn.ALPN.debug = true;
    
}