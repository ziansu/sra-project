public void drawScreen(int par1, int par2, float partialTick, java.awt.Rectangle vp, java.awt.Rectangle parentBounds) {
    if (!(updateCamera(partialTick, vp.x, vp.y, vp.width, vp.height))) {
        return ;
    }
    org.lwjgl.opengl.GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
    applyCamera(partialTick);
    TravelController.instance.setSelectionEnabled(false);
    renderScene();
    TravelController.instance.setSelectionEnabled(true);
    renderSelection();
    renderOverlay(par1, par2);
    org.lwjgl.opengl.GL11.glPopAttrib();
}