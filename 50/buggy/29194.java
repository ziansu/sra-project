private void recycle(final org.apache.reef.util.ComplexCondition call) {
    if (null != call) {
        synchronized(freeQueue) {
            freeQueue.addLast(call);
        }
    }
}