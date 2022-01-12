public bwem.MiniTile getMiniTile(org.openbw.bwapi4j.WalkPosition w, bwem.CheckMode checkMode) {
    if ((!(checkMode == (CheckMode.NoCheck))) || (isValid(w))) {
        throw new java.lang.IllegalArgumentException("WalkPosition is not valid");
    }
    return this.miniTiles.get((((getWalkSize().getX()) * (w.getY())) + (w.getX())));
}