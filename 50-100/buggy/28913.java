@java.lang.Override
public void run() {
    if (finished.compareAndSet(true, false)) {
        try {
            if (processBuckets(pagingIterator.repeat().iterator(), PageConsumeListener.NO_OP_LISTENER)) {
                consumeRemaining();
            }
        } catch (java.lang.Throwable t) {
            fail(t);
        }
        finished.set(true);
        rowReceiver.finish();
    }else {
        io.crate.operation.merge.IteratorPageDownstream.LOGGER.trace("Received repeat, but wasn't finished");
    }
}