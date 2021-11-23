protected void configureScenario(stratos.test.Stage world, stratos.test.Base base, stratos.test.BaseUI UI) {
    stratos.test.GameSettings.setDefaults();
    GameSettings.buildFree = true;
    GameSettings.paveFree = true;
    GameSettings.noChat = true;
    super.configureScenario(world, base, UI);
}