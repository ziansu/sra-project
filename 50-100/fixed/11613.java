@java.lang.Override
public void render(float delta) {
    clearingScreen();
    viewportRender();
    stage.act(Gdx.graphics.getDeltaTime());
    stage.draw();
    game.batch.begin();
    game.batch.draw(sprite_title, 0, 0);
    game.batch.end();
}