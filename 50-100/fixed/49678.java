private void prepareInitialTree(int windowSize, int frameSize) throws com.mbzshajib.mining.exception.CompletedTreeException, com.mbzshajib.mining.exception.DataNotValidException, java.io.IOException {
    com.mbzshajib.mining.processor.tree.initial.UNode currentNode = ROOT_NODE;
    for (int i = 0; i < windowSize; i++) {
        currentNode = addTransactionFrame(frameSize, currentNode, i);
    }
}