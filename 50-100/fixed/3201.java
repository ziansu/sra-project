@java.lang.Override
public void accept(net.minecraftforge.event.world.ChunkEvent.Load accepted) {
    if (accepted.isCanceled())
        return ;
    
    int cx = accepted.getChunk().xPosition;
    int cy = accepted.getChunk().zPosition;
    rtg.util.PlaneLocation location = new rtg.util.PlaneLocation.Invariant(cx, cy);
    if (!(toCheck.contains(location)))
        return ;
    
    toCheck.remove(location);
    for (rtg.util.Direction forPopulation : directions) {
        decorateIfOtherwiseSurrounded(worldObj.getChunkProvider(), location, forPopulation);
    }
}