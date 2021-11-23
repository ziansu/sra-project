public void render(float delta, com.badlogic.gdx.graphics.g2d.Batch batch) {
    FOE.map.render();
    batch.end();
    batch.begin();
    super.render(delta, batch);
}