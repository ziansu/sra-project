@java.lang.Override
public T peek() {
    synchronized(queues) {
        return queues.peekFirst().peek();
    }
}