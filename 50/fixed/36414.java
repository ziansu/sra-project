@java.lang.Override
public void create() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    player = utils.createPlayerSprite();
    background = utils.createBackgroundSprite();
    playerX = 0.0F;
    playerY = 0.0F;
}