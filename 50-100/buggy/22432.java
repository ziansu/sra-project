public void addFirst(T value) {
    (head)--;
    if ((head) < 0) {
        head = (queue.length) - 1;
    }
    if ((size) >= (queue.length)) {
        (head)++;
        enlarge();
        this.addFirst(value);
        return ;
    }
    queue[head] = value;
    (size)++;
}