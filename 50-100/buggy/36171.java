private void purgeOpOutputQueue() {
    boolean removedSome = !(opQueue.removeOlderInclusive(combinedDownFctrl.lw()).isEmpty());
    removedSome = removedSome || (opQueue.removeAll(combinedDownFctrl.acks()).isEmpty());
    if (removedSome) {
        setDownstreamsRoutable(true);
    }
}