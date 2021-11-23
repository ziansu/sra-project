@java.lang.Override
protected void doStart() throws java.lang.Exception {
    featuresPlugin = new org.apache.karaf.webconsole.features.FeaturesPlugin();
    featuresPlugin.setBundleContext(bundleContext);
    featuresPlugin.setFeaturesService(getTrackedService(org.apache.karaf.features.FeaturesService.class));
    featuresPlugin.start();
    java.util.Dictionary<java.lang.String, java.lang.String> props = new java.util.Hashtable<>();
    props.put("felix.webconsole.label", "features");
    props.put("alias", "/features");
    register(javax.servlet.Servlet.class, featuresPlugin, props);
}