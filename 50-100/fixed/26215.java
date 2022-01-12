public Queue<E> deQueue() {
    if ((size) == 0)
        throw new java.lang.IllegalStateException("Queue.deQueue");
    
    Queue<E> tmp = new Queue<E>();
    for (int i = 1; i < (size); i++)
        tmp = tmp.enQueue(elements.get(i));
    
    return tmp;
}