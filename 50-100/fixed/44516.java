public static org.bukkit.entity.ItemFrame[] getMatchingMapFrames(fr.moribus.imageonmap.map.PosterMap map, fr.zcraft.zlib.tools.world.FlatLocation location, short mapId) {
    int mapIndex = map.getIndex(mapId);
    int x = map.getColumnAt(mapIndex);
    int y = map.getRowAt(mapIndex);
    return fr.moribus.imageonmap.ui.PosterWall.getMatchingMapFrames(map, location.clone().add((-x), y));
}