public boolean hasAllChunks(uk.ac.ebi.fg.gwt.resumable.server.FileChunkInfo info) {
    if (isComplete) {
        return true;
    }
    int count = ((int) (java.lang.Math.floor((((double) (info.fileSize)) / ((double) (info.chunkSize))))));
    if ((chunks.size()) == count) {
        isComplete = true;
    }
    return isComplete;
}