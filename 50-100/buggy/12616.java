public java.util.List<com.ryan.pojo.ChunkInfo> fsp() {
    java.util.List<com.ryan.pojo.ChunkInfo> chunkList = new java.util.ArrayList<>();
    markChunkPostition(buffer, chunkSize);
    int currentPos = this.chunkId;
    (this.chunkId)++;
    while (true) {
        if (currentPos >= (list.size())) {
            return chunkList;
        }else {
            key.set(currentPos);
            chunkList.add(nextKeyValue(currentPos));
        }
    } 
}