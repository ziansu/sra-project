public void setAsBorder(com.badlogic.gdx.utils.Array<com.esbjon.entities.Entity> addedEntities, com.badlogic.gdx.utils.Array<com.esbjon.mapobjects.Tile> addedTiles, com.esbjon.mapobjects.TileVicinity vicinity) {
    (vicinityCount)++;
    (vicinityBorderCount)++;
    this.passOnEntity(addedEntities);
    if ((vicinityBorderCount) > 1) {
        addedTiles.add(this);
    }
}