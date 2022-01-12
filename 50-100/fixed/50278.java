@java.lang.Override
public E dequeue() {
    if ((this.length) == 0) {
        throw new java.lang.IllegalStateException("The queue is empty...");
    }
    com.queue.algo.QueueNode<E> top = this.root.getNext();
    this.root = top;
    --(this.length);
    return top.getE();
}