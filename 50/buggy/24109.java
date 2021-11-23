@java.lang.Override
public void create() {
    com.paladinzzz.game.CrossplatformApp.batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    setScreen(new com.paladinzzz.game.screens.MenuScreen(this));
    com.paladinzzz.game.database.Database database = new com.paladinzzz.game.database.Database();
    database.getData(database.connect());
}