public java.util.Dictionary getPropertiesForImportedConfigs(java.lang.String[] importedConfigs, java.util.Dictionary exportedProperties) {
    if (importedConfigs == null)
        return null;
    
    try {
        org.eclipse.ecf.core.provider.IContainerInstantiator ci = getInstantiator();
        return ci instanceof org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator ? ((org.eclipse.ecf.core.provider.IRemoteServiceContainerInstantiator) (ci)).getPropertiesForImportedConfigs(this, importedConfigs, exportedProperties) : null;
    } catch (java.lang.Exception e) {
        traceAndLogException(IStatus.ERROR, "getPropertiesForImportedConfigs", e);
        return null;
    }
}