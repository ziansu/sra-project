@java.lang.Override
public void offer(final delight.concurrency.schedule.Step item) {
    if (isShutDown.get()) {
        java.lang.System.err.println(((((this) + ": WARNING Trying to submit task for shutdown worker [") + item) + "]"));
        item.process();
        return ;
    }
    if (!(queue.offer(item))) {
        throw new java.lang.IllegalStateException("Queue did not accept new item.");
    }
}