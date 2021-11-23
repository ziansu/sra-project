private void requestChunkLoad(net.librofur.scar.world.chunk.ChunkPointer chunkPointer) {
    if (isChunkInBounds(chunkPointer.x, chunkPointer.y)) {
        return ;
    }
    if ((!(loadedChunks.containsKey(chunkPointer))) && (!(chunksToLoad.contains(chunkPointer)))) {
        chunksToLoad.add(chunkPointer);
    }
}