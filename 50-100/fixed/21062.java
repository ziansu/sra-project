public final int defaultShaderCustomization(final com.jogamp.opengl.GL2ES2 gl, final boolean preludeVersion, final boolean addDefaultPrecision) {
    int pos = 0;
    if (preludeVersion)
        pos = addGLSLVersion(gl);
    
    if (addDefaultPrecision)
        pos = addDefaultShaderPrecision(gl, pos);
    
    return pos;
}