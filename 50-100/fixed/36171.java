private void purgeOpOutputQueue() {
    boolean removedSome = opQueue.removeOlderInclusive(combinedDownFctrl.lw());
    removedSome = removedSome || (opQueue.removeAll(combinedDownFctrl.acks()).isEmpty());
    if (removedSome) {
        setDownstreamsRoutable(true);
    }
}