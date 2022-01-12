@java.lang.Override
public void changed(drtn.game.screens.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    if (!(engine.selectedTile().hasRoboticon())) {
        engine.deployRoboticon();
        selectTile(engine.selectedTile(), false);
    }else {
        engine.refreshUpgradeOverlay();
        upgradeOverlayVisible = true;
    }
}