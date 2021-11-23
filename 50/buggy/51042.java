public boolean isPlayerWatchingPos(net.minecraft.entity.player.EntityPlayerMP player, net.minecraft.util.BlockPos pos) {
    return this.isPlayerWatchingChunk(player, ((pos.getX()) >> 4), ((pos.getZ()) >> 4));
}