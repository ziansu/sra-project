public void useCamera() {
    org.lwjgl.opengl.GL11.glMatrixMode(GL11.GL_PROJECTION);
    {
        org.lwjgl.opengl.GL11.glRotatef(rot.x, 1, 0, 0);
        org.lwjgl.opengl.GL11.glRotatef(rot.y, 0, 1, 0);
        org.lwjgl.opengl.GL11.glRotatef(rot.z, 0, 0, 1);
        org.lwjgl.opengl.GL11.glTranslatef(loc.x, loc.y, loc.z);
    }
    org.lwjgl.opengl.GL11.glMatrixMode(GL11.GL_MODELVIEW);
}