public void loadConfig() {
    try {
        com.wuntee.oter.OterWorkshop.loadProperties();
    } catch (java.lang.Exception e) {
        com.wuntee.oter.view.Gui.logger.error("Error loading config: ", e);
        com.wuntee.oter.view.GuiWorkshop.messageError(shlOterTool, "Could not load a configuration file, please specify the configuration.");
        new com.wuntee.oter.view.ConfigurationDialog(shlOterTool).open();
    }
}