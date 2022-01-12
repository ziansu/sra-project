@java.lang.Override
public final int size() {
    org.jctools.queues.atomic.LinkedQueueAtomicNode<E> chaserNode = lvConsumerNode();
    final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> producerNode = lvProducerNode();
    int size = 0;
    while (((chaserNode != producerNode) && (chaserNode != null)) && (size < (java.lang.Integer.MAX_VALUE))) {
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> next;
        next = chaserNode.lvNext();
        if (next == chaserNode) {
            next = lvConsumerNode();
        }
        chaserNode = next;
        size++;
    } 
    return size;
}