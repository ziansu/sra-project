@java.lang.Override
protected void generateVaryings(java.lang.StringBuilder source, com.jme3.material.ShaderGenerationInfo info, com.jme3.shader.Shader.ShaderType type) {
    source.append("\n");
    for (com.jme3.shader.ShaderNodeVariable var : info.getVaryings()) {
        declareVarying(source, var, (type == (com.jme3.shader.Shader.ShaderType.Vertex) ? false : true));
    }
}