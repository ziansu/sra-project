public void NewMap(java.lang.String mapName) {
    com.mysquid.game.MapLoader MapLoad = new com.mysquid.game.MapLoader();
    decoDungeon = MapLoad.LoadMap(Gdx.files.internal(mapName));
    NextMap = MapLoad.getNextMap();
    bareDungeon = decoDungeon;
    lineDungeon = squidpony.squidgrid.mapping.DungeonUtility.hashesToLines(decoDungeon);
    player = squidpony.squidmath.Coord.get(1, 1);
    playerToCursor = new squidpony.squidai.DijkstraMap(decoDungeon, DijkstraMap.Measurement.MANHATTAN);
}