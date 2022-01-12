public void render(Entities.Light sun, Entities.Camera camera) {
    prepare();
    shader.start();
    shader.loadLight(sun);
    shader.loadViewMatrix(camera);
    renderer.render(entities);
    shader.stop();
    terrainShader.start();
    terrainShader.loadLight(sun);
    terrainShader.loadViewMatrix(camera);
    terrainRenderer.render(terrains);
    terrainShader.stop();
    terrains.clear();
    entities.clear();
}