public final int defaultShaderCustomization(final com.jogamp.opengl.GL2ES2 gl, final boolean preludeVersion, final boolean addDefaultPrecision) {
    int pos;
    if (preludeVersion) {
        pos = addGLSLVersion(gl);
    }else {
        pos = 0;
    }
    if (addDefaultPrecision) {
        pos = addDefaultShaderPrecision(gl, pos);
    }
    return pos;
}