@java.lang.Override
public E poll() {
    updateFileStore();
    return mInMemoryQueue.poll();
}