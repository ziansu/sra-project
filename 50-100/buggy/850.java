@java.lang.Override
public void chunkLoaderInit(net.minecraftforge.common.ForgeChunkManager.Ticket ticket) {
    if (!(this.worldObj.isRemote)) {
        if (ticket != null) {
            if ((this.chunkTicket) == null) {
                this.chunkTicket = ticket;
                this.chunkTicket.bindEntity(this);
                this.chunkTicket.getModData();
            }
            net.minecraftforge.common.ForgeChunkManager.forceChunk(this.chunkTicket, new net.minecraft.world.ChunkCoordIntPair(this.chunkCoordX, this.chunkCoordZ));
        }
    }
}