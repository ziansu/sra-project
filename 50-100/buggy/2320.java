private void constructCoreMembers() {
    _skedder = new chronos.pdc.command.Scheduler(_mfCiv);
    _rf = new chronos.pdc.registry.RegistryFactory();
    _rf.initRegistries();
    _advReg = ((chronos.pdc.registry.AdventureRegistry) (_rf.getRegistry(RegKey.ADV)));
    _dorm = ((chronos.pdc.registry.HeroRegistry) (_rf.getRegistry(RegKey.HERO)));
}