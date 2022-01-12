private synchronized int getDataPublisherIndex() {
    int index = currentDataPublisherIndex.getAndIncrement();
    if (index == ((maximumDataPublisherIndex.get()) - 1)) {
        currentDataPublisherIndex.set(START_INDEX);
    }
    return index;
}