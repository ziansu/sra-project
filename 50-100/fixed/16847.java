private cn.rui.chm.CHMFile.DirectoryChunk getOrCreateChunk(int chunkNo, java.lang.String firstName) {
    cn.rui.chm.CHMFile.DirectoryChunk chunk = directoryChunks[chunkNo];
    if (chunk == null) {
        synchronized(directoryChunks) {
            chunk = directoryChunks[chunkNo];
            if (chunk == null) {
                chunk = new cn.rui.chm.CHMFile.DirectoryChunk(chunkNo, firstName);
                directoryChunks[chunkNo] = chunk;
            }
        }
    }
    return chunk;
}