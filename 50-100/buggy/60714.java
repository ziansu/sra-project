public void performMergeForChunks(boolean continuation, de.glmtk.common.Pattern pattern, java.util.Collection<java.lang.String> mergedChunks, java.lang.String mergeFile) throws java.io.IOException {
    synchronized(this) {
        java.util.Set<java.lang.String> chunks = chunked.get(pattern);
        chunks.removeAll(mergedChunks);
        chunks = chunked(continuation).get(pattern);
        chunks.removeAll(mergedChunks);
        chunks.add(mergeFile);
        writeStatusToFile();
    }
}