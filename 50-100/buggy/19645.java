private int getLastBatchNumOfIteration(int numUsableDocs, int updateDocBatchSize, int minDocBatchSize, boolean noUpdateIfBatchTooSmall) {
    int completedBatchesInIteration = 0;
    int currentBatchSize = 0;
    for (int docNum = 0; docNum < numUsableDocs; ++docNum) {
        ++currentBatchSize;
        if (edu.berkeley.cs.nlp.ocular.train.FontTrainer.isBatchComplete(numUsableDocs, docNum, currentBatchSize, updateDocBatchSize, noUpdateIfBatchTooSmall)) {
            ++completedBatchesInIteration;
        }
    }
    return completedBatchesInIteration;
}