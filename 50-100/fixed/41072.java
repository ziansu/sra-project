public boolean unloadModule(final java.lang.String name) {
    final java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
    if (sm != null) {
        sm.checkPermission(org.jboss.modules.ModuleLoader.MODULE_UNLOAD_ANY_PERM);
    }
    final org.jboss.modules.ModuleLoader loader = getModuleLoader();
    final org.jboss.modules.Module module = loader.findLoadedModuleLocal(name);
    if (module == null) {
        return false;
    }else {
        loader.unloadModuleLocal(name, module);
        return true;
    }
}