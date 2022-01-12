@java.lang.Override
public void create() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    font = new com.badlogic.gdx.graphics.g2d.BitmapFont();
    font.setColor(Color.RED);
    screen = new com.dive.game.GameScreen(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), 0, 0);
    gameState = new com.dive.game.GameState(1);
    newObjects = new com.dive.game.ObjectGenerator(8, 8, 8, 0.1F, screen);
    world = new com.dive.game.World(newObjects, screen, 0.1F, gameState, font);
    pauseCD = 0;
}