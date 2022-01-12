public static boolean isValidPosition(james.monochrome.data.SceneryData scenery, java.util.List<james.monochrome.data.characters.CharacterData> characters, java.util.List<james.monochrome.data.items.ItemData> items, int x, int y) {
    for (james.monochrome.data.tiles.TileData tile : james.monochrome.utils.MapUtils.getTilesAt(scenery, characters, items, x, y)) {
        if ((tile != null) && (!(tile.canEnter())))
            return false;
        
    }
    return true;
}