@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof vg.civcraft.mc.BlockMeta.ItemType) {
        BlockMetaPlugin.logger.info("checking if they equal");
        vg.civcraft.mc.BlockMeta.ItemType other = ((vg.civcraft.mc.BlockMeta.ItemType) (obj));
        return ((other.lore.equals(lore)) && ((other.type) == (type))) && ((other.damage) == (damage));
    }
    return super.equals(obj);
}