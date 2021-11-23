@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onEntityJoin(net.minecraftforge.event.entity.EntityJoinWorldEvent e) {
    net.minecraft.entity.Entity entity = e.getEntity();
    if (entity.world.isRemote)
        obsidianAPI.ObsidianEventHandlerClient.handleOnEntityJoin(e);
    
    if (obsidianAPI.registry.AnimationRegistry.isRegisteredClass(entity.getClass())) {
        obsidianAPI.properties.EntityAnimationPropertiesProvider.register(entity, Side.SERVER);
        if (net.minecraftforge.fml.common.FMLCommonHandler.instance().getEffectiveSide().isClient())
            obsidianAPI.properties.EntityAnimationPropertiesProvider.register(entity, Side.CLIENT);
        
    }
}