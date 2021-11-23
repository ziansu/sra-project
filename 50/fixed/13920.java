private static synchronized java.lang.Integer createNextRequestId() {
    org.eclipse.ecf.provider.remoteservice.generic.RegistrySharedObject.uniqueRequestId = ((org.eclipse.ecf.provider.remoteservice.generic.RegistrySharedObject.uniqueRequestId) == (java.lang.Integer.MAX_VALUE)) ? 0 : (org.eclipse.ecf.provider.remoteservice.generic.RegistrySharedObject.uniqueRequestId) + 1;
    return new java.lang.Integer(org.eclipse.ecf.provider.remoteservice.generic.RegistrySharedObject.uniqueRequestId);
}