@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void receiveTick(cpw.mods.fml.common.gameevent.TickEvent.ServerTickEvent tick) {
    cleanUp();
    synchronized(this) {
        if ((cpw.mods.fml.common.FMLCommonHandler.instance().getSide()) == (cpw.mods.fml.relauncher.Side.SERVER)) {
            startOfList = startOfList.tick();
        }
    }
}