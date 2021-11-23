public java.util.List<com.ryan.pojo.ChunkInfo> fsp() {
    java.util.List<com.ryan.pojo.ChunkInfo> chunkList = new java.util.ArrayList<>();
    markChunkPostition(buffer, chunkSize);
    while (true) {
        int currentPos = this.chunkId;
        (this.chunkId)++;
        if (currentPos >= (list.size())) {
            return chunkList;
        }else {
            key.set(currentPos);
            chunkList.add(nextKeyValue(currentPos));
        }
    } 
}