@java.lang.Override
public boolean renderWorldBlock(net.minecraft.world.IBlockAccess world, int x, int y, int z, net.minecraft.block.Block block, int modelId, net.minecraft.client.renderer.RenderBlocks renderer) {
    com.aleksey.decorations.Render.Blocks.RenderMudBrickRaw.setBound(com.aleksey.decorations.Render.Blocks.RenderMudBrickRaw._bound, renderer);
    renderer.renderStandardBlock(block, x, y, z);
    return true;
}