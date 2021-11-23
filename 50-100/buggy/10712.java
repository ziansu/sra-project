public void put(java.util.Map<java.lang.String, java.lang.Object> event) {
    com.lmax.disruptor.RingBuffer<com.dtstack.logstash.assembly.disruptor.MapEvent> ringBuffer = disruptor.getRingBuffer();
    long sequence = ringBuffer.next();
    try {
        com.dtstack.logstash.assembly.disruptor.MapEvent mapEvent = ringBuffer.get(sequence);
        if ((event != null) && ((event.size()) > 0))
            mapEvent.setEvent(event);
        
    } finally {
        ringBuffer.publish(sequence);
    }
}