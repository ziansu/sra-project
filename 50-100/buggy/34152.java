@java.lang.Override
protected void initViewport() {
    worldHeight = ((Gdx.graphics.getHeight()) / (Gdx.graphics.getWidth())) * (worldWidth);
    setViewport(new com.badlogic.gdx.utils.viewport.StretchViewport(worldWidth, worldHeight));
    getViewport().update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true);
}