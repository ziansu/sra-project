@java.lang.SuppressWarnings(value = "unchecked")
private void addTargetForUnregister(org.eclipse.ecf.provider.remoteservice.generic.RemoteServiceRegistrationImpl serviceRegistration, org.eclipse.ecf.provider.remoteservice.generic.ID targetContainerID) {
    java.util.List existingTargets = ((java.util.List) (localRegistryUnregistrationTargets.get(serviceRegistration)));
    if (existingTargets == null) {
        existingTargets = new java.util.ArrayList();
    }
    existingTargets.add(targetContainerID);
    org.eclipse.ecf.provider.remoteservice.generic.Trace.trace(Activator.PLUGIN_ID, ((((("addTargetForUnregister localContainerID=" + (getLocalContainerID())) + ",targetContainerID=") + targetContainerID) + ",serviceRegistration=") + serviceRegistration));
    localRegistryUnregistrationTargets.put(serviceRegistration, existingTargets);
}