public void initBagConfig() {
    file = new java.io.File(FMLPreEvent.getModConfigurationDirectory(), "Lootbags_BagConfig.cfg");
    java.lang.String basePath = ((java.io.File) (cpw.mods.fml.relauncher.FMLInjectionData.data()[6])).getAbsolutePath().replace(java.io.File.separatorChar, '/').replace("/.", "");
    java.lang.String path = file.getAbsolutePath().replace(java.io.File.separatorChar, '/').replace("/./", "/").replace(basePath, "");
    fileName = path;
    reloadBagConfig();
}