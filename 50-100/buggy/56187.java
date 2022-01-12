public void removeAll(E e) {
    if (this.contains(e)) {
        QueueNode current = this.front;
        while ((current.next) != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        } 
        if (this.front.data.equals(e)) {
            this.front = this.front.next;
        }
    }
}