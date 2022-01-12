public void drawStack(net.minecraft.item.ItemStack item) {
    int cornerX = ((gui.width) - (gui.getXSize())) / 2;
    int cornerY = ((gui.height) - (gui.getYSize())) / 2;
    net.minecraft.client.renderer.RenderHelper.enableGUIStandardItemLighting();
    gui.drawStack(item, (cornerX + (x)), (cornerY + (y)));
    net.minecraft.client.renderer.GlStateManager.color(1, 1, 1, 1);
}