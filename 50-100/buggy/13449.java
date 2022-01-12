public boolean renderWorldBlock(net.minecraft.world.IBlockAccess world, int x, int y, int z, net.minecraft.block.Block block, int modelId, net.minecraft.client.renderer.RenderBlocks renderer) {
    if ((Render.OreBlockRenderPass) == 0) {
        renderer.renderStandardBlock(Blocks.stone, x, y, z);
    }else {
        renderer.renderStandardBlock(block, x, y, z);
    }
    return true;
}