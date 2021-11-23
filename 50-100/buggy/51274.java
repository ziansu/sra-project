public org.apache.catalina.Context addContext(org.apache.catalina.Host host, java.lang.String contextPath, java.lang.String contextName, java.lang.String dir) {
    silence(host, contextPath);
    org.apache.catalina.Context ctx = createContext(host, contextPath);
    ctx.setName(contextName);
    ctx.setPath(contextPath);
    ctx.setDocBase(dir);
    ctx.addLifecycleListener(new org.apache.catalina.startup.Tomcat.FixContextListener());
    if (host == null) {
        getHost().addChild(ctx);
    }else {
        host.addChild(ctx);
    }
    return ctx;
}