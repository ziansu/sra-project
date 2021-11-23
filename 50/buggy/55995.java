@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void preBiomeDecorate(rtg.event.DecorateBiomeEvent.Pre event) {
    if ((event.world.getWorldInfo().getTerrainType()) instanceof rtg.world.WorldTypeRTG) {
        isWorldTypeRTG = true;
    }
}