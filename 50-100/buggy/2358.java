protected void drawItem(final int x, final int y, final net.minecraft.item.ItemStack is) {
    this.zLevel = 100.0F;
    this.itemRender.zLevel = 100.0F;
    org.lwjgl.opengl.GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_LIGHTING);
    org.lwjgl.opengl.GL11.glEnable(GL12.GL_RESCALE_NORMAL);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_DEPTH_TEST);
    net.minecraft.client.renderer.RenderHelper.enableGUIStandardItemLighting();
    this.itemRender.renderItemAndEffectIntoGUI(is, x, y);
    org.lwjgl.opengl.GL11.glPopAttrib();
    this.itemRender.zLevel = 0.0F;
    this.zLevel = 0.0F;
}