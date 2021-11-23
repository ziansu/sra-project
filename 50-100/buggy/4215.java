@java.lang.Override
protected void drawBackground() {
    org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    parent.getMinecraft().renderEngine.bindTexture(texture);
    parent.drawTexturedModalRect(posX, posY, 0, 0, 66, 66);
    if ((items.length) == 10)
        parent.drawTexturedModalRect(((posX) + 18), ((posY) + 69), 66, 0, 30, 30);
    
}