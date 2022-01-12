@java.lang.Override
public void chunkLoaderInit(net.minecraftforge.common.ForgeChunkManager.Ticket ticket) {
    if (!(worldObj.isRemote)) {
        if (ticket != null) {
            if ((chunkTicket) == null) {
                chunkTicket = ticket;
                chunkTicket.bindEntity(this);
                chunkTicket.getModData();
            }
            net.minecraftforge.common.ForgeChunkManager.forceChunk(chunkTicket, new net.minecraft.world.ChunkCoordIntPair(chunkCoordX, chunkCoordZ));
        }
    }
}