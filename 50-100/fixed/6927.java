public int compare(java.lang.Object o1, java.lang.Object o2) {
    com.sun.messaging.jmq.jmsserver.multibroker.raptor.TakingoverEntry.XidEntry x1 = ((com.sun.messaging.jmq.jmsserver.multibroker.raptor.TakingoverEntry.XidEntry) (o1));
    com.sun.messaging.jmq.jmsserver.multibroker.raptor.TakingoverEntry.XidEntry x2 = ((com.sun.messaging.jmq.jmsserver.multibroker.raptor.TakingoverEntry.XidEntry) (o2));
    return java.lang.Long.compare(x1.brokerSession.getTimestamp(), x2.brokerSession.getTimestamp());
}