private T steal() throws bag.ConcurrentBag.CannotStealException {
    bag.ConcurrentBag<T>.ThreadMetaData md = localMetadata.get();
    while (true) {
        T item = nextStealItem();
        if (item != null) {
            java.util.concurrent.atomic.AtomicReferenceArray<T> stealBlock = bagArrayList.get(md.stealFromBagIndex).get(md.stealFromListIndex);
            if (stealBlock.compareAndSet(((md.stealFromBlockIndex) - 1), item, null)) {
                return item;
            }
        }
        (md.stealFromBlockIndex)++;
    } 
}