@java.lang.Override
public void renderInventoryBlock(net.minecraft.block.Block block, int metadata, int modelId, net.minecraft.client.renderer.RenderBlocks renderer) {
    float min = 1.0F / 16.0F;
    float max = 15.0F / 16.0F;
    renderer.setRenderBounds(min, min, min, max, max, max);
    fair.tfcengineer.common.Render.SidedBlockRender.renderInvBlock(block, metadata, renderer);
}