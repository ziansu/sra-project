public void uninstall(de.espirit.firstspirit.access.Connection connection, java.lang.String moduleName) {
    if ((connection == null) || (!(connection.isConnected()))) {
        throw new java.lang.IllegalStateException("Connection is null or not connected!");
    }
    de.espirit.firstspirit.agency.ModuleAdminAgent moduleAdminAgent = connection.getBroker().requestSpecialist(ModuleAdminAgent.TYPE);
    com.espirit.moddev.moduleuninstaller.ModuleUninstaller.uninstallModule(moduleName, moduleAdminAgent);
}