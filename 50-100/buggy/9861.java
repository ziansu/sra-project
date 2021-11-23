@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
    game.batch.setTransformMatrix(camera.view);
    game.batch.setProjectionMatrix(camera.combined);
    game.shapeRenderer.setTransformMatrix(camera.view);
    game.shapeRenderer.setProjectionMatrix(camera.combined);
    map.draw(game.batch);
    entityManager.draw();
    debugRenderer.render(world, camera.combined);
}