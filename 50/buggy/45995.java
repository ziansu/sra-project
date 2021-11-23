@java.lang.Override
public void registerRenderInformation() {
    cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(brainstonemod.common.tileentity.TileEntityBlockBrainLogicBlock.class, new brainstonemod.client.render.TileEntityBlockBrainLogicBlockRenderer());
    brainstonemod.client.ClientProxy.BrainLogicBlockRenderType = cpw.mods.fml.client.registry.RenderingRegistry.getNextAvailableRenderId();
    cpw.mods.fml.client.registry.RenderingRegistry.registerBlockHandler(new brainstonemod.client.render.BrainStoneRenderBrainLogicBlockHandler());
}