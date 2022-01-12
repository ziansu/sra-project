@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    finalLevelUpDialog.hide();
    ((com.badlogic.gdx.Game) (Gdx.app.getApplicationListener())).setScreen(new ch.dhj.game.screens.OverworldScreen(getEncounterScreen().getAssetManager(), getEncounterScreen().getBatch(), this, enemyManager));
}