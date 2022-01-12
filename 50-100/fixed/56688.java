public com.ibm.ws.st.core.internal.OutOfSyncModuleInfo checkModuleConfigOutOfSync(org.eclipse.wst.server.core.IModule module) {
    if (module == null) {
        return null;
    }
    if (excludeSyncModules.containsKey(module)) {
        return null;
    }
    com.ibm.ws.st.core.internal.ServerExtensionWrapper[] extensions = getWebSphereServer().getServerExtensions();
    for (com.ibm.ws.st.core.internal.ServerExtensionWrapper se : extensions) {
        if (se.supportsApplicationType(module.getModuleType())) {
            com.ibm.ws.st.core.internal.OutOfSyncModuleInfo info = se.checkModuleConfigOutOfSync(module);
            if (info != null) {
                return info;
            }
        }
    }
    return null;
}