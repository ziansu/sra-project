static void shadowPrep(lumin.GL2 gl) {
    gl.glClearStencil(128);
    gl.glColorMask(false, false, false, false);
    gl.glDepthMask(false);
    gl.glEnable(gl.GL_STENCIL_TEST);
    gl.glClear(gl.GL_STENCIL_BUFFER_BIT);
    gl.glStencilOpSeparate(gl.GL_BACK, gl.GL_KEEP, gl.GL_KEEP, gl.GL_INCR_WRAP);
    gl.glStencilOpSeparate(gl.GL_FRONT, gl.GL_KEEP, gl.GL_KEEP, gl.GL_DECR_WRAP);
}