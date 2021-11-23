public void commitOrRollbackIfNeeded() {
    if (((counter) % (commitModulo)) == 0) {
        commitAndStartNewTransaction();
    }
}