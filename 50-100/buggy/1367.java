public void uninstall(de.espirit.firstspirit.access.Connection connection, long projectId, java.lang.String moduleName) {
    if ((connection == null) || (!(connection.isConnected()))) {
        throw new java.lang.IllegalStateException("Connection is null or not connected!");
    }
    de.espirit.firstspirit.agency.ModuleAdminAgent moduleAdminAgent = connection.getBroker().requestSpecialist(ModuleAdminAgent.TYPE);
    de.espirit.firstspirit.module.descriptor.ModuleDescriptor moduleDescriptor = com.espirit.moddev.moduleuninstaller.ModuleUninstaller.getModuleByName(moduleName, moduleAdminAgent);
    com.espirit.moddev.moduleuninstaller.ModuleUninstaller.uninstallProjectWebApps(projectId, moduleDescriptor, moduleAdminAgent);
    com.espirit.moddev.moduleuninstaller.ModuleUninstaller.uninstallProjectApps(projectId, moduleDescriptor, connection);
    com.espirit.moddev.moduleuninstaller.ModuleUninstaller.uninstallModule(moduleName, moduleAdminAgent);
}