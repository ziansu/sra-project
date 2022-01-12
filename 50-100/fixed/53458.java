@cpw.mods.fml.common.eventhandler.SubscribeEvent(priority = cpw.mods.fml.common.eventhandler.EventPriority.NORMAL, receiveCanceled = true)
public void onEvent(net.minecraftforge.event.world.BlockEvent.PlaceEvent event) {
    if (!(event.world.isRemote)) {
        net.minecraft.entity.player.EntityPlayer theBreaker = event.player;
        net.minecraft.world.chunk.Chunk chunkToCheck = event.world.getChunkFromBlockCoords(event.x, event.z);
        event.setCanceled(this.checkList(chunkToCheck, theBreaker));
        java.lang.System.out.println(((("PLACING BLOCK IN " + (chunkToCheck.xPosition)) + ",") + (chunkToCheck.zPosition)));
    }
}