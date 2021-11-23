public T get(kilim.EventSubscriber eo) {
    kilim.EventSubscriber producer = null;
    T ret;
    if ((message.get()) == null) {
        ret = null;
        addMsgAvailableListener(eo);
    }else {
        ret = message.getAndSet(null);
        if ((srcs.size()) > 0) {
            producer = srcs.poll();
        }
    }
    if (producer != null) {
        producer.onEvent(this, kilim.Cell.spaceAvailble);
    }
    return ret;
}