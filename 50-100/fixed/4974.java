public T get(kilim.EventSubscriber eo) {
    kilim.EventSubscriber producer = null;
    T ret = message.get();
    if (ret == null) {
        addMsgAvailableListener(eo);
    }else {
        message.set(null);
        if ((srcs.size()) > 0) {
            producer = srcs.poll();
        }
    }
    if (producer != null) {
        producer.onEvent(this, kilim.Cell.spaceAvailble);
    }
    return ret;
}