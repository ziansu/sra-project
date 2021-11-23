@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void preBiomeDecorate(rtg.event.DecorateBiomeEvent.Pre event) {
    isWorldTypeRTG = (event.world.getWorldInfo().getTerrainType()) instanceof rtg.world.WorldTypeRTG;
}