public org.apache.kafka.clients.consumer.ConsumerRecord<K, V> makeNext() {
    while (((current) == null) || (!(current.hasNext()))) {
        if (iters.hasNext())
            current = iters.next().iterator();
        else
            return allDone();
        
    } 
    return current.next();
}