public void factoryReset() {
    setupConfig = new dcp.logic.model.config.SetupConfig(appConfig.getDefaultSetupConfig());
    dcp.logic.factory.PackFactory.clear();
    if ((packs) != null)
        packs.clear();
    
    dcp.logic.factory.GroupFactory.clear();
    if ((groups) != null)
        groups.clear();
    
    tabsInit();
    dcp.config.io.IOFactory.setSaveFile("");
}