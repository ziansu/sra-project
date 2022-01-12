@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof vg.civcraft.mc.BlockMeta.BlockType) {
        vg.civcraft.mc.BlockMeta.BlockType other = ((vg.civcraft.mc.BlockMeta.BlockType) (obj));
        return (((other.getMeta()) == (getMeta())) && ((getType()) == (getType()))) && ((getData()) == (getData()));
    }
    return super.equals(obj);
}