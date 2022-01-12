private void initGL() {
    com.nishu.utils.Shader temp = new com.nishu.utils.Shader("/shaders/chunk.vert", "/shaders/chunk.frag");
    shader = new com.nishu.utils.ShaderProgram(temp.getvShader(), temp.getfShader());
    temp = new com.nishu.utils.Shader("/shaders/clouds.vert", "/shaders/clouds.frag");
    cloudShader = new com.nishu.utils.ShaderProgram(temp.getvShader(), temp.getfShader());
    temp = new com.nishu.utils.Shader("/shaders/water.vert", "/shaders/water.frag");
    waterShader = new com.nishu.utils.ShaderProgram(temp.getvShader(), temp.getfShader());
}