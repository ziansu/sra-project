public void updateChunk(net.minecraft.world.chunk.Chunk rchunk) {
    long id = buildcraft.robotics.map.MapUtils.getIDFromCoords(rchunk.xPosition, rchunk.zPosition);
    buildcraft.robotics.map.MapChunk chunk = getChunk(rchunk.xPosition, rchunk.zPosition);
    chunk.update(rchunk);
    synchronized(updatedChunks) {
        updatedChunks.add(id);
    }
    synchronized(timeToUpdate) {
        timeToUpdate.remove(rchunk);
    }
    regionUpdateTime.put(id, new java.util.Date().getTime());
}