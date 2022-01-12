public final void draw() {
    renderPre();
    org.lwjgl.opengl.GL11.glDrawArrays(drawMode, 0, vertexCount);
    renderPost();
}