@java.lang.Override
public java.util.List<java.net.URL> getResources(java.lang.ClassLoader classLoader, java.util.Collection<java.lang.String> expressions) {
    java.util.List<java.net.URL> resources = new java.util.ArrayList<>();
    for (java.lang.String expression : expressions) {
        for (org.apache.tamaya.resource.ResourceLocator locator : org.apache.tamaya.spi.ServiceContextManager.getServiceContext().getServices(org.apache.tamaya.resource.ResourceLocator.class)) {
            java.util.Collection<java.net.URL> found = locator.lookup(classLoader, expression);
            if (!(found.isEmpty())) {
                resources.addAll(found);
                break;
            }
        }
    }
    return resources;
}