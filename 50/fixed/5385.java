public com.structures.queue.QueueNode remove() {
    com.structures.queue.QueueNode temp = head;
    if ((head) != null)
        head = head.next;
    
    return temp;
}