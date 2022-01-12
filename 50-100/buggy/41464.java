protected final void unloadModuleLocal(org.jboss.modules.Module module) throws java.lang.SecurityException {
    final org.jboss.modules.ModuleLoader moduleLoader = module.getModuleLoader();
    if (moduleLoader != (this)) {
        throw new java.lang.SecurityException((("Attempted to unload " + module) + " from a different module loader"));
    }
    final org.jboss.modules.ModuleIdentifier id = module.getIdentifier();
    final org.jboss.modules.ModuleLoader.FutureModule futureModule = moduleMap.get(id);
    if ((futureModule != null) && ((futureModule.module) == module)) {
        moduleMap.remove(id, futureModule);
    }
}