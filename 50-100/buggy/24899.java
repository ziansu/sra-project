private synchronized void loadMap() {
    java.lang.System.out.println("World.java  load map");
    map = new net.hollowbit.archipelo.world.Map(nextMapSnapshot, nextChunkData, this);
    for (net.hollowbit.archipelo.entity.Entity entity : entities)
        entity.unload();
    
    entities.clear();
    for (net.hollowbit.archipeloshared.ChunkData chunk : nextChunkData) {
        addEntitiesInChunkData(chunk);
    }
    nextMapSnapshot = null;
    nextChunkData = null;
}