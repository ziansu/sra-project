private void requestChunkUnload(net.librofur.scar.world.chunk.ChunkPointer chunkPointer) {
    if (!(isChunkInBounds(chunkPointer.x, chunkPointer.y))) {
        return ;
    }
    if ((loadedChunks.containsKey(chunkPointer)) && (!(chunksToUnload.contains(chunkPointer)))) {
        chunksToUnload.add(chunkPointer);
    }
}