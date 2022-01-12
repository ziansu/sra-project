@java.lang.Override
public void changed(com.catan.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    com.catan.LoadingScreen.pickNumbers = false;
    com.catan.LoadingScreen.setter = true;
    game.setScreen(new com.catan.HexGenerator(game));
}