@java.lang.Override
public void unregisterHandler(org.eclipse.smarthome.core.thing.Thing thing) {
    org.osgi.framework.ServiceRegistration<org.eclipse.smarthome.core.thing.binding.ThingHandler> serviceRegistration = thingHandlers.remove(thing.getUID().toString());
    if (serviceRegistration != null) {
        org.eclipse.smarthome.core.thing.binding.ThingHandler thingHandler = ((org.eclipse.smarthome.core.thing.binding.ThingHandler) (bundleContext.getService(serviceRegistration.getReference())));
        serviceRegistration.unregister();
        removeHandler(thingHandler);
        thingHandler.dispose();
        if (thingHandler instanceof org.eclipse.smarthome.core.thing.binding.BaseThingHandler) {
            ((org.eclipse.smarthome.core.thing.binding.BaseThingHandler) (thingHandler)).unsetBundleContext(bundleContext);
        }
    }
}