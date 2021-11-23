@java.lang.Override
protected void initViewport() {
    worldHeight = ((int) ((((Gdx.graphics.getHeight()) * 1.0F) / (Gdx.graphics.getWidth())) * (worldWidth)));
    setViewport(new com.badlogic.gdx.utils.viewport.StretchViewport(worldWidth, worldHeight));
    getViewport().update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true);
}