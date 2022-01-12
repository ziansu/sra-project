protected void endFrameBufferSpace(javax.media.opengl.GL gl) {
    fbo.unbind(gl);
    gl.glMatrixMode(GL.GL_PROJECTION);
    gl.glPopMatrix();
    gl.glMatrixMode(GL.GL_MODELVIEW);
    gl.glPopMatrix();
    gl.glPopAttrib();
}