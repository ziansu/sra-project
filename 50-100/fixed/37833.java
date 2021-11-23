@java.lang.Override
public void draw() {
    texture.bind();
    org.lwjgl.opengl.GL11.glBegin(GL11.GL_POLYGON);
    for (int i = 0; i < (bounds.vertices.length); i++) {
        bounds.vertices[i].add(position).glVertex();
        texcoordsShapes.vertices[i].glTexCoord();
    }
    org.lwjgl.opengl.GL11.glEnd();
}