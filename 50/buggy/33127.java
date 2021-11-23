@java.lang.Override
public void drawScreen(int par1, int par2, float par3) {
    org.lwjgl.opengl.GL11.glDisable(GL12.GL_RESCALE_NORMAL);
    super.drawScreen(par1, par2, par3);
    this.xSize_lo_2 = par1;
    this.ySize_lo_2 = par2;
}