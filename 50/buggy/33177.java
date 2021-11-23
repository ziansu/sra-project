@java.lang.Override
public void changed(drtn.game.screens.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    engine.nextPhase();
    lastTileClickedFlash.cancelAnimation();
}