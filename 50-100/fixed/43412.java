public void run(java.lang.String application, java.io.File modulesDir, java.lang.String descriptorPattern, java.util.List<java.lang.String> args) {
    myPlatform = new org.bardsoftware.impl.eclipsito.PlatformImpl();
    Boot.LOG.info("Eclipsito platform is running.");
    org.bardsoftware.impl.eclipsito.BootImpl.ShutdownHook.install();
    org.bardsoftware.impl.eclipsito.PluginDescriptor[] plugins = getPlugins(modulesDir, descriptorPattern);
    run(plugins, application, args.toArray(new java.lang.String[args.size()]));
}