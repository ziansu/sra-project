public void factoryReset() {
    setupConfig = new dcp.logic.model.config.SetupConfig(appConfig.getDefaultSetupConfig());
    dcp.logic.factory.PackFactory.clear();
    packs.clear();
    dcp.logic.factory.GroupFactory.clear();
    groups.clear();
    tabsInit();
    dcp.config.io.IOFactory.setSaveFile("");
}