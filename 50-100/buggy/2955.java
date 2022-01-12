private com.mbzshajib.mining.processor.tree.initial.UNode addTransactionFrame(int frameSize, com.mbzshajib.mining.processor.tree.initial.UNode currentNode, int frameNo) throws com.mbzshajib.mining.exception.CompletedTreeException, com.mbzshajib.mining.exception.DataNotValidException, java.io.IOException {
    java.util.List<com.mbzshajib.mining.processor.tree.initial.UNode> list;
    for (int j = 0; j < frameSize; j++) {
        list = getTransaction(frameNo);
        if (!(list.isEmpty())) {
            throw new com.mbzshajib.mining.exception.CompletedTreeException();
        }
        for (com.mbzshajib.mining.processor.tree.initial.UNode node : list) {
            currentNode = addNode(node, currentNode);
        }
        currentNode = ROOT_NODE;
    }
    return currentNode;
}