@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onRenderWorldLast(net.minecraftforge.client.event.RenderWorldLastEvent event) {
    com.blamejared.teamy.events.ClientEvents.doRender(new com.blamejared.teamy.events.BlockPos(0, 80, 0));
    com.blamejared.teamy.events.ClientEvents.doRender(new com.blamejared.teamy.events.BlockPos(100, 80, 0));
    com.blamejared.teamy.events.ClientEvents.doRender(new com.blamejared.teamy.events.BlockPos(0, 80, 100));
    com.blamejared.teamy.events.ClientEvents.doRender(new com.blamejared.teamy.events.BlockPos(100, 80, 100));
}