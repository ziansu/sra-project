@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void receiveTick(cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent tick) {
    cleanUp();
    synchronized(this) {
        startOfList = startOfList.tick();
    }
}