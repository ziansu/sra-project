@java.lang.Override
public void create() {
    this.spriteBatch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    com.arctite.dontfreeze.util.SoundManager.loadSounds();
    menu = new com.arctite.dontfreeze.MenuScreen(this, spriteBatch);
    setScreen(menu);
}