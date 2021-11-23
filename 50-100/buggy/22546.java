public void drawString(org.newdawn.slick.TrueTypeFont f, float x, float y, java.lang.String s, org.newdawn.slick.Color c) {
    org.lwjgl.opengl.GL11.glPushMatrix();
    org.lwjgl.opengl.GL11.glTranslated(x, y, 0);
    org.lwjgl.opengl.GL11.glScalef((1.0F / 512), (1.0F / 512), 1);
    f.drawString(x, y, s, Color.black);
    org.lwjgl.opengl.GL11.glPopMatrix();
}