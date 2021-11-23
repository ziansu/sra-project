@java.lang.Override
public void offer(E e) {
    if ((size) != (java.lang.Integer.MAX_VALUE)) {
        homework.lection08.task02.queue.LinkedQueue.Node<E> temp = tail;
        tail = new homework.lection08.task02.queue.LinkedQueue.Node(e, null);
        if ((head) == null)
            head = tail;
        else
            temp.nextNode = tail;
        
        (size)++;
    }else
        throw new java.lang.OutOfMemoryError("Queue size can't be more than Integer.MAX_VALUE.");
    
}