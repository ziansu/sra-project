private cn.rui.chm.CHMFile.DirectoryChunk getOrCreateChunk(int chunkNo, java.lang.String firstName) {
    synchronized(directoryChunks) {
        cn.rui.chm.CHMFile.DirectoryChunk chunk = directoryChunks[chunkNo];
        if (chunk == null) {
            chunk = new cn.rui.chm.CHMFile.DirectoryChunk(chunkNo, firstName);
            directoryChunks[chunkNo] = chunk;
        }
        return chunk;
    }
}