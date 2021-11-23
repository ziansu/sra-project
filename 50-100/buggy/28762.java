public static void replaceAll(java.util.List<woohoo.utils.gameobjects.Tile> tiles) {
    woohoo.utils.framework.UndoManager.add(new woohoo.utils.framework.UndoState(woohoo.utils.gameobjects.TileMap.getTileListCopy(woohoo.utils.gameobjects.TileMap.tileList), woohoo.utils.gameobjects.TileMap.mapWidth, woohoo.utils.gameobjects.TileMap.mapHeight));
    for (woohoo.utils.gameobjects.Tile tile : tiles) {
        tile.replaceTexture(woohoo.utils.gameobjects.TileSelector.getCurrentID());
        tile.setRotation(woohoo.utils.gameobjects.TileSelector.getCurrentRotation());
    }
}