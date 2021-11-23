protected void renderTESRMethod(net.minecraft.item.ItemStack itemStack, xyz.brassgoggledcoders.moarcarts.items.ItemMinecartBase itemMinecartBase, net.minecraft.block.state.IBlockState blockState) {
    rotateTESR();
    net.minecraft.client.renderer.GlStateManager.pushMatrix();
    net.minecraft.client.renderer.GlStateManager.translate((-0.5F), (-0.5F), (-0.5F));
    TileEntityRendererDispatcher.instance.renderTileEntityAt(itemMinecartBase.getRenderTileEntity(itemStack, xyz.brassgoggledcoders.boilerplate.lib.client.ClientHelper.world()), 0, 0, 0, 0.0F);
    net.minecraft.client.renderer.GlStateManager.popMatrix();
}