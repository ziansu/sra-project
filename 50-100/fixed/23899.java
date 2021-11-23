@java.lang.Override
public void renderInventoryItem(net.minecraftforge.client.IItemRenderer.ItemRenderType type, net.minecraft.item.ItemStack itemStack, java.lang.Object... data) {
    org.lwjgl.opengl.GL11.glTranslatef(0.5F, 0, 0.5F);
    org.lwjgl.opengl.GL11.glRotatef(90, 0, 1, 0);
    cpw.mods.fml.client.FMLClientHandler.instance().getClient().renderEngine.bindTexture(Assets.AMS_TEXTURE);
    Assets.AMS_BOTTOM_MODEL.renderAll();
    org.lwjgl.opengl.GL11.glTranslatef(0, 0.5F, 0);
    Assets.AMS_TOP_MODEL.renderAll();
}