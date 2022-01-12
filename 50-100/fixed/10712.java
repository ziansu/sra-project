public void put(java.util.Map<java.lang.String, java.lang.Object> event) {
    if ((event != null) && ((event.size()) > 0)) {
        long sequence = ringBuffer.next();
        try {
            com.dtstack.logstash.assembly.disruptor.MapEvent mapEvent = ringBuffer.get(sequence);
            mapEvent.setEvent(event);
        } finally {
            ringBuffer.publish(sequence);
        }
    }
}