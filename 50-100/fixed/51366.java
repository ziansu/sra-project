public void unsetAsBorder(com.badlogic.gdx.utils.Array<com.esbjon.entities.Entity> removedEntities, com.badlogic.gdx.utils.Array<com.esbjon.mapobjects.Tile> removedTiles) {
    (vicinityCount)--;
    (vicinityBorderCount)--;
    this.passOnEntity(removedEntities);
    if ((vicinityBorderCount) > 0) {
        removedTiles.add(this);
    }
}