public static boolean isChunkTicking(net.minecraft.world.WorldServer world, net.minecraft.util.math.BlockPos pos) {
    if (!(world.isBlockLoaded(pos, false))) {
        return false;
    }
    if ((world.getPersistentChunks().isEmpty()) && (world.playerEntities.isEmpty())) {
        try {
            if ((com.Da_Technomancer.crossroads.API.MiscOp.WORLD_LOADING_TIMER.getInt(world)) > 300) {
                return false;
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalAccessException e) {
            Main.logger.catching(e);
            return false;
        }
    }
    return true;
}