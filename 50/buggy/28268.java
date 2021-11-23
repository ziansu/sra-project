@java.lang.Override
public void changed(cg.group4.view.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    ((com.badlogic.gdx.Game) (Gdx.app.getApplicationListener())).setScreen(new cg.group4.view.Settings());
    Gdx.app.debug("Button", "Settings");
}