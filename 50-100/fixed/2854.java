private void checkForNewBlocks() {
    long randomOffset = 0;
    if (((java.lang.System.currentTimeMillis()) - (ml_lastBlockCreation)) > ((ml_timeBetweenBlockCreations) + randomOffset)) {
        addBlock();
        ml_lastBlockCreation = java.lang.System.currentTimeMillis();
    }
}