public static void init() {
    com.Da_Technomancer.crossroads.dimensions.ModDimensions.workspaceDimType = net.minecraft.world.DimensionType.register(Main.MODID, "_workspace", 567, com.Da_Technomancer.crossroads.dimensions.WorkspaceWorldProvider.class, false);
    com.Da_Technomancer.crossroads.dimensions.ModDimensions.prototypeDimType = net.minecraft.world.DimensionType.register(Main.MODID, "_prototype", 568, com.Da_Technomancer.crossroads.dimensions.WorkspaceWorldProvider.class, true);
    net.minecraftforge.common.DimensionManager.registerDimension(com.Da_Technomancer.crossroads.dimensions.ModDimensions.PROTOTYPE_DIM_ID, com.Da_Technomancer.crossroads.dimensions.ModDimensions.prototypeDimType);
    net.minecraftforge.common.ForgeChunkManager.setForcedChunkLoadingCallback(Main.instance, new net.minecraftforge.common.ForgeChunkManager.LoadingCallback() {
        @java.lang.Override
        public void ticketsLoaded(java.util.List<net.minecraftforge.common.ForgeChunkManager.Ticket> tickets, net.minecraft.world.World world) {
        }
    });
}