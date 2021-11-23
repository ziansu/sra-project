@java.lang.Override
public void updateTileEntities(java.util.Collection<net.minecraft.tileentity.TileEntity> remove, java.util.Collection<net.minecraft.tileentity.TileEntity> add) {
    synchronized(this.blockEntities) {
        this.blockEntities.removeAll(remove);
        this.blockEntities.addAll(add);
    }
}