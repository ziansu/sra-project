@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    prochainepop.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(0.7F));
    java.lang.System.out.println("POPULATION SUIVANTE!!");
    gam.setEnModeRalenti(false);
    gam.setCalculNbIndividu(0);
    Gdx.graphics.setVSync(false);
    gam.setScreen(new screens.GameScreenPourRepetition(gam));
}