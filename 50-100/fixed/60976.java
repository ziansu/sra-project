@cpw.mods.fml.common.Mod.EventHandler
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    com.subsistence.Subsistence.network = NetworkRegistry.INSTANCE.newSimpleChannel("subsistence");
    com.subsistence.Subsistence.network.registerMessage(PacketFX.PacketFXHandler.class, com.subsistence.common.network.PacketFX.class, 0, Side.CLIENT);
    com.subsistence.Subsistence.network.registerMessage(PacketSyncContents.PacketSyncContentsHandler.class, com.subsistence.common.network.PacketSyncContents.class, 1, Side.CLIENT);
    com.subsistence.Subsistence.network.registerMessage(PacketSyncContents.PacketSyncContentsHandler.class, com.subsistence.common.network.PacketSyncContents.class, 1, Side.SERVER);
    com.subsistence.Subsistence.configPath = ((event.getModConfigurationDirectory().getPath()) + (java.io.File.separator)) + "/Subsistence/";
    com.subsistence.Subsistence.proxy.preInit();
}