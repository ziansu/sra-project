@java.lang.Override
public void render(float delta) {
    clearingScreen();
    viewportRender();
    game.batch.begin();
    game.batch.draw(sprite_title, 100, (((com.jsl.babytrader.Data.ConstData.SCREEN_HEIGHT) - (sprite_title.getHeight())) - 50));
    stage.act(Gdx.graphics.getDeltaTime());
    stage.draw();
    game.batch.end();
}