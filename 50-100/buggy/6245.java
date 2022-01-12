public static void unregister() {
    if ((me.guichaguri.pvptime.PvPTimeUpdater.tick) != null)
        net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().unregister(me.guichaguri.pvptime.PvPTimeUpdater.tick);
    
    if ((me.guichaguri.pvptime.PvPTimeUpdater.event) != null)
        MinecraftForge.EVENT_BUS.unregister(me.guichaguri.pvptime.PvPTimeUpdater.event);
    
    me.guichaguri.pvptime.PvPTimeUpdater.tick = null;
    me.guichaguri.pvptime.PvPTimeUpdater.event = null;
}