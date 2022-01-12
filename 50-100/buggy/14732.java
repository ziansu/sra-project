@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object arg) {
    if (arg instanceof programming.breakout.engine.GameState.GameDelta) {
        programming.breakout.engine.GameState.GameDelta delta = ((programming.breakout.engine.GameState.GameDelta) (arg));
        for (programming.breakout.engine.Entity entity : delta.entitiesMoved) {
            updateMoved(entity);
        }
        for (programming.breakout.engine.Entity entity : delta.entitiesDestroyed) {
            removeEntity(entity);
        }
        for (programming.breakout.engine.Entity entity : delta.entitiesAdded) {
            addEntity(entity);
        }
    }else {
        redrawAll();
    }
    add(background);
}