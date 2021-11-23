public void render() {
    glBindTexture(com.p3k.magictale.engine.graphics.GL_TEXTURE_2D, textureId);
    glBegin(com.p3k.magictale.engine.graphics.GL_QUADS);
    {
        glVertex2f(0, 0);
        glTexCoord2f(1, 1);
        glVertex2f(width, 0);
        glTexCoord2f(1, 0);
        glVertex2f(width, (-(height)));
        glTexCoord2f(0, 0);
        glVertex2f(0, (-(height)));
        glTexCoord2f(0, 1);
    }
    glEnd();
}