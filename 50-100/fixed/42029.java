public void enqueue(Item item) {
    a_Queue.Queue<Item>.Node node = new Node();
    node.item = item;
    node.next = null;
    if (isEmpty()) {
        front = node;
        back = front;
    }else {
        back.next = node;
        back = back.next;
    }
    ++(N);
}