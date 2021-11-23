public void updateTileEntities(java.util.Set<net.minecraft.tileentity.TileEntity> remove, java.util.Set<net.minecraft.tileentity.TileEntity> add) {
    synchronized(this.blockEntities) {
        this.blockEntities.removeAll(remove);
        this.blockEntities.addAll(add);
    }
}