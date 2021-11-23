public synchronized void markDirty(mcp.mobius.betterbarrels.common.blocks.TileEntityBarrel barrel, boolean bspace) {
    this.dirtyBarrels.put(barrel, true);
    if (bspace)
        if ((barrel.coreUpgrades.hasEnder) && (!(barrel.getWorldObj().isRemote)))
            mcp.mobius.betterbarrels.bspace.BSpaceStorageHandler.instance().markAllDirty(barrel.id);
        
    
}