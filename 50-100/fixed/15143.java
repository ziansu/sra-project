@java.lang.Override
public boolean canPlace(greymerk.roguelike.worldgen.MetaBlock block, greymerk.roguelike.worldgen.Coord pos, greymerk.roguelike.worldgen.Cardinal dir) {
    if (!(this.isAirBlock(pos)))
        return false;
    
    greymerk.roguelike.worldgen.Coord cursor = new greymerk.roguelike.worldgen.Coord(pos);
    cursor.add(dir);
    net.minecraft.block.material.Material m = this.getBlock(cursor).getMaterial();
    return !(m.isReplaceable());
}