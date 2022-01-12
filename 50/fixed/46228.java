@java.lang.Override
public void validate() {
    super.validate();
    if (!(this.worldObj.isRemote))
        if (!(micdoodle8.mods.galacticraft.core.tile.TileEntityOxygenSealer.loadedTiles.contains(this)))
            micdoodle8.mods.galacticraft.core.tile.TileEntityOxygenSealer.loadedTiles.add(this);
        
    
}