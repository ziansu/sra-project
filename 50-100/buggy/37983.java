@java.lang.Override
protected void updateVertexSource(java.lang.String src) {
    java.util.List<java.lang.String> vars = java.util.Arrays.asList(ChunksVertexShader.COLOR_PARS, ChunksVertexShader.LOGDEPTHBUF_PAR);
    java.util.List<java.lang.String> main1 = java.util.Arrays.asList(ChunksVertexShader.COLOR);
    java.util.List<java.lang.String> main2 = java.util.Arrays.asList(ChunksVertexShader.LOGDEPTHBUF);
    super.updateFragmentSource(thothbot.parallax.core.client.shaders.Shader.updateShaderSource(src, vars, main1, main2));
}