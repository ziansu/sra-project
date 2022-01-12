private void clearToDecorateList() {
    if (populating)
        return ;
    
    net.minecraft.world.chunk.IChunkProvider ichunkprovider = worldObj.getChunkProvider();
    java.util.Set<rtg.util.PlaneLocation> toProcess = doableLocations();
    while ((toProcess.size()) > 0) {
        for (rtg.util.PlaneLocation location : toProcess) {
            doPopulate(ichunkprovider, location.x(), location.z());
            toDecorate.remove(location);
        }
        toProcess = doableLocations();
    } 
}