public static void init(java.io.File configFile) {
    mdc.voodoocraft.config.VoodooConfig.config = new net.minecraftforge.common.config.Configuration(configFile);
    mdc.voodoocraft.config.VoodooConfig.config.addCustomCategoryComment("Tweaks", "Tweak certian things");
    mdc.voodoocraft.config.VoodooConfig.syncConfiguration();
}