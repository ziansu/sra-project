@java.lang.Override
public void render() {
    mainShader.bind();
    mainShader.update(camera, directionalLight);
    testTextureDiffuse.bind();
    testMesh.render();
    world.render(mainShader, camera);
    mainShader.bind();
    mainShader.setUniform("m_model", new org.lwjgl.util.vector.Matrix4f());
}