public org.binu.board.BlockQueue createBlockQueue(int[][] blockQueueData) {
    final org.binu.board.BlockQueue blockQueue = new org.binu.board.BlockQueue();
    for (int[] aBlockQueueData : blockQueueData) {
        final org.binu.board.Block colourBlock = createColourBlock(aBlockQueueData[0], aBlockQueueData[1]);
        blockQueue.add(colourBlock);
    }
    return blockQueue;
}