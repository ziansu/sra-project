@java.lang.Override
public void drawAtOrigin(net.minecraft.tileentity.TileEntity te) {
    org.lwjgl.opengl.GL11.glDisable(GL11.GL_CULL_FACE);
    org.lwjgl.opengl.GL11.glTranslated(0, 0, (-0.8));
    super.drawAtOrigin(te);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_CULL_FACE);
}