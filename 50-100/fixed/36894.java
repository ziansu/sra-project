public java.lang.String[] getSupportedIntents() {
    try {
        org.eclipse.ecf.core.provider.IContainerInstantiator ci = getInstantiator();
        return ci instanceof org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator ? ((org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator) (ci)).getSupportedIntents(this) : null;
    } catch (java.lang.Exception e) {
        traceAndLogException(IStatus.ERROR, "getSupportedIntents", e);
        return null;
    }
}