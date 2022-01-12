private void checkForNewBlocks() {
    long randomOffset = ((random.nextLong()) % 1000) + 500;
    if (((java.lang.System.currentTimeMillis()) - (ml_lastBlockCreation)) > ((ml_timeBetweenBlockCreations) + randomOffset)) {
        addBlock();
        ml_lastBlockCreation = java.lang.System.currentTimeMillis();
    }
}