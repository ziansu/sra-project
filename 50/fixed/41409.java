@java.lang.Override
public void changed(com.catan.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    com.catan.LoadingScreen.pickNumbers = true;
    com.catan.LoadingScreen.setter = false;
    game.setScreen(new com.catan.HexGenerator(game));
}