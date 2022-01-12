@java.lang.Override
public boolean renderWorldBlock(net.minecraft.world.IBlockAccess world, int x, int y, int z, net.minecraft.block.Block block, int modelId, net.minecraft.client.renderer.RenderBlocks renderer) {
    com.aleksey.merchants.Render.Blocks.RenderAnvilDie.setBound(com.aleksey.merchants.Render.Blocks.RenderAnvilDie._logBound, renderer);
    renderer.renderStandardBlock(((com.aleksey.merchants.Blocks.Devices.BlockCustomAnvilDie) (block)).getLogBlock(), x, y, z);
    com.aleksey.merchants.Render.Blocks.RenderAnvilDie.setBound(com.aleksey.merchants.Render.Blocks.RenderAnvilDie._anvilDieBound, renderer);
    renderer.renderStandardBlock(block, x, y, z);
    return true;
}