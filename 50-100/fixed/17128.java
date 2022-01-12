private void clearToDecorateList() {
    if (populating)
        return ;
    
    net.minecraft.world.chunk.IChunkProvider ichunkprovider = worldObj.getChunkProvider();
    java.util.Set<rtg.util.PlaneLocation> toProcess = doableLocations(0);
    while ((toProcess.size()) > 0) {
        for (rtg.util.PlaneLocation location : toProcess) {
            toDecorate.remove(location);
        }
        for (rtg.util.PlaneLocation location : toProcess) {
            doPopulate(ichunkprovider, location.x(), location.z());
        }
        toProcess = doableLocations(0);
    } 
}