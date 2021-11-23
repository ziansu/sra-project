@java.lang.Override
public com.jme3.shader.ShaderGenerator getShaderGenerator(java.util.EnumSet<com.jme3.renderer.Caps> caps) {
    if ((shaderGenerator) == null) {
        if (caps.contains(Caps.GLSL150)) {
            shaderGenerator = new com.jme3.shader.Glsl150ShaderGenerator(this);
        }else {
            shaderGenerator = new com.jme3.shader.Glsl100ShaderGenerator(this);
        }
    }
    return shaderGenerator;
}