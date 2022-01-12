private void build(minusk.minuslib.gl.Shader... shaders) {
    for (minusk.minuslib.gl.Shader s : shaders)
        glAttachShader(id, s.id);
    
    glLinkProgram(id);
    if ((glGetProgrami(id, minusk.minuslib.gl.GL_LINK_STATUS)) != (org.lwjgl.opengl.GL11.GL_FALSE))
        throw new java.lang.RuntimeException(glGetProgramInfoLog(id));
    
}