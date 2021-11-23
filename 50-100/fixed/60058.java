public int createTextureID() {
    org.helioviewer.jhv.opengl.OpenGLHelper.glContext.makeCurrent();
    javax.media.opengl.GL2 gl = org.helioviewer.jhv.opengl.OpenGLHelper.glContext.getGL().getGL2();
    int[] tmp = new int[1];
    gl.glGenTextures(1, tmp, 0);
    this.textureID = tmp[0];
    return tmp[0];
}