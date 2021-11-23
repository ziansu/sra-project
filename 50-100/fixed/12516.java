private void unregisterHandler(org.osgi.framework.ServiceRegistration<org.eclipse.smarthome.core.thing.binding.ThingHandler> serviceRegistration) {
    org.eclipse.smarthome.core.thing.binding.ThingHandler thingHandler = ((org.eclipse.smarthome.core.thing.binding.ThingHandler) (bundleContext.getService(serviceRegistration.getReference())));
    removeHandler(thingHandler);
    thingHandler.dispose();
    serviceRegistration.unregister();
    if (thingHandler instanceof org.eclipse.smarthome.core.thing.binding.BaseThingHandler) {
        ((org.eclipse.smarthome.core.thing.binding.BaseThingHandler) (thingHandler)).unsetBundleContext(bundleContext);
    }
}