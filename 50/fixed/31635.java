private java.lang.String getChildrenOfChunk(context.healthinformatics.sequentialdataanalysis.Chunk chunk) {
    java.lang.StringBuilder buildString = new java.lang.StringBuilder();
    buildString.append(loopThroughChunks(chunk.getChildren(), false));
    return buildString.toString();
}