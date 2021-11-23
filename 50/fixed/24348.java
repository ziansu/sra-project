@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void tickEnd(cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent event) {
    if ((event.phase) == (TickEvent.Phase.END)) {
        net.minecraft.world.World world = event.world;
        checkLightning(world);
        pneumaticCraft.common.ai.DroneClaimManager.getInstance(world).update();
    }
}