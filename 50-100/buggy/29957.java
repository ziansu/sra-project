@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) throws java.lang.NoSuchFieldException, java.lang.SecurityException {
    com.soundbody.foodstats.ModFoodStatsHandler.init();
    MinecraftForge.EVENT_BUS.register(new com.soundbody.modifiers.AttributeEventHandler());
    MinecraftForge.EVENT_BUS.register(new com.soundbody.properties.event.ExtendedPropertyEventHandler());
    MinecraftForge.EVENT_BUS.register(new com.soundbody.foodstats.ModFoodStatsHandler());
    MinecraftForge.EVENT_BUS.register(new com.soundbody.client.RenderFoodBarHandler());
    com.soundbody.SoundBody.simpleChannel = NetworkRegistry.INSTANCE.newSimpleChannel(SBReferences.NAME);
    com.soundbody.SoundBody.simpleChannel.registerMessage(com.soundbody.network.HandlerGeneralServer.class, com.soundbody.network.PacketGeneralServer.class, 0, Side.SERVER);
    com.soundbody.SoundBody.simpleChannel.registerMessage(com.soundbody.network.HandlerGeneralClient.class, com.soundbody.network.PacketGeneralClient.class, 1, Side.CLIENT);
}