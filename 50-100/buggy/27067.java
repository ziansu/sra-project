public static com.badlogic.gdx.graphics.glutils.ShaderProgram makeShader(java.lang.String vertex, java.lang.String fragment) {
    com.badlogic.gdx.graphics.glutils.ShaderProgram shader = new com.badlogic.gdx.graphics.glutils.ShaderProgram(net.benmclean.libgdxdos.Palette4.vertexShader, net.benmclean.libgdxdos.Palette4.fragmentShaderYieldTransparency);
    if (!(shader.isCompiled()))
        throw new com.badlogic.gdx.utils.GdxRuntimeException(("Couldn't compile shader: " + (shader.getLog())));
    
    return shader;
}