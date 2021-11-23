public boolean renderWorldBlock(net.minecraft.world.IBlockAccess world, int x, int y, int z, net.minecraft.block.Block block, int modelId, net.minecraft.client.renderer.RenderBlocks renderer) {
    renderer.renderStandardBlock(Blocks.stone, x, y, z);
    return renderer.renderStandardBlock(block, x, y, z);
}