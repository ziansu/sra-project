public static void addModule(org.squiddev.cctweaks.core.registry.IModule module) {
    if (module instanceof org.squiddev.cctweaks.core.registry.IClientModule) {
        module = new org.squiddev.cctweaks.core.registry.Registry.RegisterWrapperClient(((org.squiddev.cctweaks.core.registry.IClientModule) (module)));
    }
    org.squiddev.cctweaks.core.registry.Registry.modules.add(module);
    if ((org.squiddev.cctweaks.core.registry.Registry.preInit) && (module.canLoad())) {
        module.preInit();
        if (org.squiddev.cctweaks.core.registry.Registry.init) {
            module.init();
            if (org.squiddev.cctweaks.core.registry.Registry.postInit)
                module.postInit();
            
        }
    }
}