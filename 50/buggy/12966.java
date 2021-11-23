private void complete() {
    if (processor.complete()) {
        outbox.offer(com.hazelcast.jet.impl.util.DoneItem.DONE_ITEM);
    }else {
        progTracker.notDone();
    }
}