protected void drawItem(final int x, final int y, final net.minecraft.item.ItemStack is) {
    this.zLevel = 100.0F;
    this.itemRender.zLevel = 100.0F;
    net.minecraft.client.renderer.RenderHelper.enableGUIStandardItemLighting();
    this.itemRender.renderItemAndEffectIntoGUI(is, x, y);
    this.itemRender.zLevel = 0.0F;
    this.zLevel = 0.0F;
}