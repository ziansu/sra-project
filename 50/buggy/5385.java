public com.structures.queue.QueueNode remove() {
    com.structures.queue.QueueNode temp = head;
    head = head.next;
    return temp;
}