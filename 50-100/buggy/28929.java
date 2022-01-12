@java.lang.Override
public void renderItem(code.elix_x.mods.teleplates.proxy.ItemRenderType type, net.minecraft.item.ItemStack item, java.lang.Object... data) {
    if (type == (IItemRenderer.ItemRenderType.ENTITY)) {
        org.lwjgl.opengl.GL11.glTranslatef((-0.5F), 0.0F, (-0.5F));
    }
    renderer.renderTileEntityAt(te, 0, 0, 0, 0, false);
}