private static void set(greymerk.roguelike.worldgen.IWorldEditor editor, java.util.Random rand, greymerk.roguelike.worldgen.Coord origin) {
    if (!(editor.isAirBlock(origin)))
        return ;
    
    greymerk.roguelike.worldgen.MetaBlock vine = greymerk.roguelike.worldgen.blocks.BlockType.get(BlockType.VINE);
    for (greymerk.roguelike.worldgen.Cardinal dir : greymerk.roguelike.worldgen.Cardinal.directions) {
        greymerk.roguelike.worldgen.Coord c = new greymerk.roguelike.worldgen.Coord(origin);
        c.add(dir);
        if (editor.canPlace(vine, c, dir)) {
            greymerk.roguelike.worldgen.blocks.Vine.setOrientation(vine, dir).set(editor, c);
            return ;
        }
    }
}