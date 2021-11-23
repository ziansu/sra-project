private static void set(greymerk.roguelike.worldgen.IWorldEditor editor, java.util.Random rand, greymerk.roguelike.worldgen.Coord origin) {
    if (!(editor.isAirBlock(origin)))
        return ;
    
    greymerk.roguelike.worldgen.MetaBlock vine = greymerk.roguelike.worldgen.blocks.BlockType.get(BlockType.VINE);
    for (greymerk.roguelike.worldgen.Cardinal dir : greymerk.roguelike.worldgen.Cardinal.directions) {
        if (editor.canPlace(vine, origin, dir)) {
            greymerk.roguelike.worldgen.blocks.Vine.setOrientation(vine, dir);
            vine.set(editor, origin);
            return ;
        }
    }
}