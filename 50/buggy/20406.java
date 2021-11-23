public void onEnable() {
    addRecipes();
    org.bukkit.plugin.PluginDescriptionFile pdfFile = this.getDescription();
    this.logger.info(((pdfFile.getName()) + "has been enabled"));
    java.util.logging.Logger.getLogger("Minecraft").info("Quarry has been enabled");
}