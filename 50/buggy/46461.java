public static void useUndo(woohoo.utils.framework.UndoState undo) {
    woohoo.utils.gameobjects.TileMap.tileList = woohoo.utils.gameobjects.TileMap.getTileListCopy(undo.state);
    woohoo.utils.gameobjects.TileMap.mapWidth = undo.width;
    woohoo.utils.gameobjects.TileMap.mapHeight = undo.height;
    woohoo.utils.gameobjects.TileMap.moveAll(undo.shift[0], undo.shift[1]);
}