@java.lang.Override
public void registerRenderInformation() {
    super.registerRenderInformation();
    cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(brainstonemod.common.tileentity.TileEntityBlockBrainLogicBlock.class, new brainstonemod.client.render.TileEntityBlockBrainLogicBlockRenderer());
    cpw.mods.fml.client.registry.RenderingRegistry.registerBlockHandler(new brainstonemod.client.render.BrainStoneRenderBrainLogicBlockHandler());
}