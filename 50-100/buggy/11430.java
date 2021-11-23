public void markUsed(java.lang.String tupleId) {
    while ((reservedQueue.size()) > 0) {
        com.dipaan.bgcolor.Tuple tuple = reservedQueue.peek();
        if (tuple.getId().equals(tupleId)) {
            reservedQueue.remove(tuple);
        }else
            if (tuple.isExpired()) {
                reservedQueue.remove(tuple);
                availableQueue.offer(tuple);
            }
        
    } 
}