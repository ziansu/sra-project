@java.lang.Override
public void changed(final cg.group4.view.ChangeEvent event, final com.badlogic.gdx.scenes.scene2d.Actor actor) {
    ((com.badlogic.gdx.Game) (Gdx.app.getApplicationListener())).setScreen(new cg.group4.view.Settings());
    java.lang.System.out.println("Settings");
}