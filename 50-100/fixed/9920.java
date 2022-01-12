public void add(int data) {
    (this.size)++;
    if ((this.front) == null) {
        this.front = new QueueNode(data);
    }else {
        QueueNode current = this.front;
        while ((current.next) != null) {
            current = current.next;
        } 
        current.next = new QueueNode(data);
    }
}