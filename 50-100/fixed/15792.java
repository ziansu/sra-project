protected void registerEventHandlers() {
    MinecraftForge.EVENT_BUS.register(com.smithsmodding.smithscore.common.player.management.PlayerManager.getInstance());
    MinecraftForge.EVENT_BUS.register(com.smithsmodding.smithscore.common.structures.StructureRegistry.getInstance());
    com.smithsmodding.smithscore.SmithsCore.getRegistry().getCommonBus().register(new com.smithsmodding.smithscore.common.handlers.network.CommonNetworkableEventHandler());
    com.smithsmodding.smithscore.SmithsCore.getRegistry().getNetworkBus().register(new com.smithsmodding.smithscore.client.handlers.gui.GuiInputEventHandler());
    com.smithsmodding.smithscore.SmithsCore.getRegistry().getCommonBus().register(com.smithsmodding.smithscore.common.structures.StructureRegistry.getInstance());
}