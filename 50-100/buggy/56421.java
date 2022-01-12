public void init() {
    glfwSetWindowTitle(Main.getWindowID(), "First Game");
    shaderProgram = new ShaderProgram();
    shaderProgram.attachVertexShader("VertexShader.vs");
    shaderProgram.attachFragmentShader("FragmentShader.fs");
    shaderProgram.link();
    LevelLoader.loadLevel("Level1.txt", this);
}