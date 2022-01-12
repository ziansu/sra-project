@java.lang.Override
protected void updateVertexSource(java.lang.String src) {
    java.util.List<java.lang.String> vars = java.util.Arrays.asList(ChunksVertexShader.MORPHTARGET_PARS, ChunksVertexShader.LOGDEPTHBUF_PAR);
    java.util.List<java.lang.String> main1 = java.util.Arrays.asList(ChunksVertexShader.MORPHTARGET, ChunksVertexShader.DEFAULT, ChunksVertexShader.LOGDEPTHBUF);
    super.updateVertexSource(thothbot.parallax.core.client.shaders.Shader.updateShaderSource(src, vars, main1));
}