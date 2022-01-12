private boolean isFresh(java.io.File output) {
    return (output.exists()) && (!(processingChain.isInQueue(output)));
}