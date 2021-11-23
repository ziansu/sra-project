public java.lang.String[] getSupportedIntents() {
    java.lang.String method = "getSupportedIntents";
    org.eclipse.ecf.core.util.Trace.entering(ECFPlugin.PLUGIN_ID, ECFDebugOptions.METHODS_ENTERING, this.getClass(), method);
    try {
        org.eclipse.ecf.core.provider.IContainerInstantiator ci = getInstantiator();
        return ci instanceof org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator ? ((org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator) (ci)).getSupportedIntents(this) : null;
    } catch (java.lang.Exception e) {
        traceAndLogException(IStatus.ERROR, method, e);
        return null;
    }
}