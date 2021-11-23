final boolean goToPos(jsettlers.common.position.ShortPoint2D targetPos) {
    assert (state) == (jsettlers.logic.movable.Movable.EMovableState.DOING_NOTHING) : "can't do goToPos() if state isn't DOING_NOTHING. curr state: " + (state);
    jsettlers.algorithms.path.Path path = grid.calculatePathTo(this, targetPos);
    if (path == null) {
        return false;
    }else {
        followPath(path);
        return true;
    }
}