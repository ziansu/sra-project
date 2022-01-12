public com.hgames.rhogue.generation.map.DungeonGenerator setGrassObjectives(int percent, int nbPools) {
    if (100 < percent)
        throw new java.lang.IllegalStateException(("Percentage of grass must be negative or in [0, 100]. Received: " + percent));
    
    if (0 <= percent)
        this.grassPercentage = percent;
    
    if (0 <= (grassPatches))
        this.grassPatches = nbPools;
    
    return this;
}