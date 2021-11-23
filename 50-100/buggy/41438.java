@java.lang.Override
public void drawBFCprimitive(int drawOnlyMode) {
    if (drawOnlyMode == 1)
        return ;
    
    org.lwjgl.opengl.GL11.glLineWidth(org.nschmidt.ldparteditor.enums.View.lineWidthGL[0]);
    org.lwjgl.opengl.GL11.glColor4f(org.nschmidt.ldparteditor.enums.View.primitive_edge_Colour_r[0], org.nschmidt.ldparteditor.enums.View.primitive_edge_Colour_g[0], org.nschmidt.ldparteditor.enums.View.primitive_edge_Colour_b[0], 1.0F);
    org.lwjgl.opengl.GL11.glBegin(GL11.GL_LINES);
    org.lwjgl.opengl.GL11.glVertex3f(x1, y1, z1);
    org.lwjgl.opengl.GL11.glVertex3f(x2, y2, z2);
    org.lwjgl.opengl.GL11.glEnd();
}