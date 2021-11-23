public java.lang.String[] getImportedConfigs(java.lang.String[] exporterSupportedConfigs) {
    if (exporterSupportedConfigs == null)
        return null;
    
    try {
        org.eclipse.ecf.core.provider.IContainerInstantiator ci = getInstantiator();
        return ci instanceof org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator ? ((org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator) (ci)).getImportedConfigs(this, exporterSupportedConfigs) : null;
    } catch (java.lang.Exception e) {
        traceAndLogException(IStatus.ERROR, "getImportedConfigs", e);
        return null;
    }
}