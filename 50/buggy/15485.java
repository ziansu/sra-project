public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    org.wso2.developerstudio.eclipse.carbonserver44.Activator.plugin = this;
    java.lang.System.out.println("org.wso2.developerstudio.eclipse.carbonserver44");
    registerProductServers();
}