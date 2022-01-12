@com.google.common.eventbus.Subscribe
public void onConstructionLast(elec332.core.main.FMLEvent e) {
    if (e instanceof elec332.core.main.FMLConstructionEvent) {
        elec332.core.util.FMLUtil.runAs(elec332.core.util.FMLUtil.getModContainer(this), () -> {
            asmDataProcessor = new elec332.core.main.ElecCoreDiscoverer();
            asmDataProcessor.identify(((elec332.core.main.FMLConstructionEvent) (e)).getASMHarvestedData());
            elec332.core.main.ElecModHandler.identifyMods();
            asmDataProcessor.process(LoaderState.CONSTRUCTING);
        });
    }
    if (e instanceof elec332.core.main.FMLPreInitializationEvent) {
        elec332.core.util.FMLUtil.runAs(elec332.core.util.FMLUtil.getModContainer(this), ElecModelHandler::registerModels);
    }
}